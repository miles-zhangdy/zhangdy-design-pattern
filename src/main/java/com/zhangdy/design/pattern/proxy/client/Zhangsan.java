package com.zhangdy.design.pattern.proxy.client;

/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    @Override
    public void findLove(String name) {
        System.out.println("张三要求：肤白貌美大长腿@!最好叫" + name);
    }

    @Override
    public void buyInsure() {
        System.out.println("30万");
    }

}
