package com.zhangdy.design.pattern.decoratorpattern;

public class Work extends NavigationDecorator {

    public Work(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 作业 ";}




}
