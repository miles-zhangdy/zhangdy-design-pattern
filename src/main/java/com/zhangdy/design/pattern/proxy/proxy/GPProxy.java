package com.zhangdy.design.pattern.proxy.proxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 用来生成源代码的工具类
 * Created by Tom.
 */
public class GPProxy {

    public static final String ln = "\r\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class<?> [] interfaces, GPInvocationHandler h){
       try {
           //1、动态生成源代码.java文件
           String src = generateSrc(interfaces);

//           System.out.println(src);
           //2、Java文件输出磁盘
           String filePath = GPProxy.class.getResource("").getPath();
//           System.out.println(filePath);
           File f = new File(filePath + "$Proxy0.java");
           FileWriter fw = new FileWriter(f);
           fw.write(src);
           fw.flush();
           fw.close();

           //3、把生成的.java文件编译成.class文件
           JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
           StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
           Iterable iterable = manage.getJavaFileObjects(f);

          JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
          task.call();
          manage.close();

           //4、编译生成的.class文件加载到JVM中来
          Class proxyClass =  classLoader.findClass("$Proxy0");
          Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
          f.delete();

           //5、返回字节码重组以后的新的代理对象
           return c.newInstance(h);
       }catch (Exception e){
           e.printStackTrace();
       }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces){
            StringBuffer sb = new StringBuffer();
            sb.append(GPProxy.class.getPackage() + ";" + ln);
            sb.append("import " + interfaces[0].getName() + ";" + ln);
            sb.append("import java.lang.reflect.*;" + ln);
            sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
                sb.append("GPInvocationHandler h;" + ln);
                sb.append("public $Proxy0(GPInvocationHandler h) { " + ln);
                    sb.append("this.h = h;");
                sb.append("}" + ln);
                for (Method method : interfaces[0].getMethods()){

                    Class<?>[] parameterTypes = method.getParameterTypes();


                    StringBuffer paramsTypeAndNames = new StringBuffer();
                    StringBuffer paramValues = new StringBuffer();
                    StringBuffer paramClasses = new StringBuffer();
                    int length = parameterTypes.length;
                    for (int i = 0; i < length; i++) {
                        Class clazz = parameterTypes[i];
                        String type = clazz.getName();
                        String paramName = toLowerFirstCase(clazz.getSimpleName());
                        paramsTypeAndNames.append(type + " " +  paramName );
                        paramValues.append(paramName);
                        paramClasses.append(clazz.getName() + ".class");
                        if(i < length - 1){
                            paramsTypeAndNames.append(", ");
                            paramClasses.append(", ");
                            paramValues.append(", ");
                        }
                    }

                    sb.append("public ").append(method.getReturnType()).append(" ").append(method.getName()).append(" (").append(paramsTypeAndNames.toString()).append("){").append(ln);
                    sb.append("try{").append(ln)
                            .append("Method m = ")
                            .append(interfaces[0].getName()).append( ".class.getMethod(\"" ).append( method.getName())
                            .append("\",new Class[]{" ).append(paramClasses.toString()).append( "});").append(ln)
                            .append((hasReturnValue(method.getReturnType()) ? "return " : "") + getCaseCode("this.h.invoke(this,m,new Object[]{" + paramValues + "})",method.getReturnType()) + ";" + ln);
                        sb.append("}catch(Error _ex) { }");
                        sb.append("catch(Throwable e){" + ln);
                        sb.append("throw new UndeclaredThrowableException(e);" + ln);
                        sb.append("}");
                        sb.append(getReturnEmptyCode(method.getReturnType()));
                    sb.append("}");



                }
            sb.append("}" + ln);
            return sb.toString();
    }


    private static Map<Class,Class> mappings = new HashMap<Class, Class>();
    static {
        mappings.put(int.class,Integer.class);
    }

    private static String getReturnEmptyCode(Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "return 0;";
        }else if(returnClass == void.class){
            return "";
        }else {
            return "return null;";
        }
    }

    private static String getCaseCode(String code,Class<?> returnClass){
        if(mappings.containsKey(returnClass)){
            return "((" + mappings.get(returnClass).getName() +  ")" + code + ")." + returnClass.getSimpleName() + "Value()";
        }
        return code;
    }

    private static boolean hasReturnValue(Class<?> clazz){
        return clazz != void.class;
    }

    private static String toLowerFirstCase(String src){
        char [] chars = src.toCharArray();
        chars[0] += 32;
        return String.valueOf(chars);
    }

}
