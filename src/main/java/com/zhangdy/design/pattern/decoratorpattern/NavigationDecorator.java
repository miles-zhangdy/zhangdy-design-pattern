package com.zhangdy.design.pattern.decoratorpattern;

public class NavigationDecorator extends Navigation{

    private Navigation navigation;

    public NavigationDecorator(Navigation navigation){
        this.navigation = navigation;
    }

    @Override
    protected String getName() {
        return navigation.getName();
    }

}
