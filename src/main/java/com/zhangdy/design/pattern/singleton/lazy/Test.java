package com.zhangdy.design.pattern.singleton.lazy;

public class Test {

    public static void main(String[] args) {
        new Thread(()->{
            LazyStaticInnerClassSingleton instance = LazyStaticInnerClassSingleton.getInstance();
            System.out.println(instance);


        }).start();


        new Thread(()->{
            LazyStaticInnerClassSingleton instance = LazyStaticInnerClassSingleton.getInstance();
            System.out.println(instance);


        }).start();

    }


}
