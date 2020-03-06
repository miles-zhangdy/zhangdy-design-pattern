package com.zhangdy.design.pattern.decoratorpattern;

public class Article extends NavigationDecorator {

    public Article(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 文章 ";}




}
