package com.zhangdy.design.pattern.prototype;

public class TestMain {

    public static void main(String[] args) throws Exception {

        TestUserEntity testUserEntity = new TestUserEntity();
        testUserEntity.setId(1L);
        testUserEntity.setName("lisi");

        System.out.println("源对象 ---> " + testUserEntity.toString());
        TestUserEntity clone = testUserEntity.clone();
        System.out.println("克隆对象 ---> " + clone.toString());
        System.out.println(testUserEntity == clone);

    }

}
