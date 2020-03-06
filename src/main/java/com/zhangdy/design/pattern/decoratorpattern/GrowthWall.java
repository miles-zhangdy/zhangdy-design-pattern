package com.zhangdy.design.pattern.decoratorpattern;

public class GrowthWall extends NavigationDecorator {

    public GrowthWall(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 成长墙 ";}




}
