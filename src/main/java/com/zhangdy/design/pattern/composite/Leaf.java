package com.zhangdy.design.pattern.composite;

public class Leaf implements IComponent {

    @Override
    public void sayHello(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        System.out.println("leaf hello");
    }

    @Override
    public void add(IComponent component) {
    }

    @Override
    public void remove(IComponent component) {
    }

    @Override
    public IComponent getChild(int i) {
        return null;
    }
}
