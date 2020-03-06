package com.zhangdy.design.pattern.decoratorpattern;

public class ShoppingMall extends NavigationDecorator {

    public ShoppingMall(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 商城 ";}




}
