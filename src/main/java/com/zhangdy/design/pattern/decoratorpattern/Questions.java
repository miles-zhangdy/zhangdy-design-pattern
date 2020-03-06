package com.zhangdy.design.pattern.decoratorpattern;

public class Questions extends NavigationDecorator {

    public Questions(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 问答 ";}




}
