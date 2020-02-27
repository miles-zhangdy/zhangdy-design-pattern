package com.zhangdy.design.pattern.singleton.lazy;

public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){}

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private final static LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
