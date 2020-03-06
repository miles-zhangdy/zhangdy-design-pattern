package com.zhangdy.design.pattern.decoratorpattern;

public class Test {

    public static void main(String[] args) {

        Navigation unloginNavigation = null;
        unloginNavigation = new BaseNavigation();
        unloginNavigation = new Questions(unloginNavigation);
        unloginNavigation = new Article(unloginNavigation);
        unloginNavigation = new BoutiqueCourse(unloginNavigation);
        unloginNavigation = new Bubbling(unloginNavigation);
        unloginNavigation = new ShoppingMall(unloginNavigation);
        System.out.println("未登录 " + unloginNavigation.getName());

        Navigation loginNavigation = null;
        loginNavigation = new BaseNavigation();
        loginNavigation = new Questions(loginNavigation);
        loginNavigation = new Article(loginNavigation);
        loginNavigation = new Work(loginNavigation);
        loginNavigation = new QuestionBank(loginNavigation);
        loginNavigation = new GrowthWall(loginNavigation);
        loginNavigation = new BoutiqueCourse(loginNavigation);
        loginNavigation = new Bubbling(loginNavigation);
        loginNavigation = new ShoppingMall(loginNavigation);
        System.out.println("登  录 " + loginNavigation.getName());


    }

}
