package com.zhangdy.design.pattern.singleton.lazy;

/**
 * 双重检查
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (LazyDoubleCheckSingleton.class) {
            if (instance != null) {
                return instance;
            }
            instance = new LazyDoubleCheckSingleton();
            return instance;
        }

    }
}
