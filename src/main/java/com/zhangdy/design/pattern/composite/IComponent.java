package com.zhangdy.design.pattern.composite;

public interface IComponent {
    void sayHello(int deep);

    void add(IComponent component);

    void remove(IComponent component);

    IComponent getChild(int i);

}
