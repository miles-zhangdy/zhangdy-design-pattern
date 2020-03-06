package com.zhangdy.design.pattern.decoratorpattern;

public class BoutiqueCourse extends NavigationDecorator {

    public BoutiqueCourse(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 精品课 ";}




}
