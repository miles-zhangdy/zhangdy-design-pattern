package com.zhangdy.design.pattern.decoratorpattern;

public class QuestionBank extends NavigationDecorator {

    public QuestionBank(Navigation navigation){
        super(navigation);
    }
    protected String getName(){ return super.getName() + " 题库 ";}




}
