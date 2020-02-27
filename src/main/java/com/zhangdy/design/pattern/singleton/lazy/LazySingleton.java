package com.zhangdy.design.pattern.singleton.lazy;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public synchronized static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }


}
