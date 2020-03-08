package com.zhangdy.design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    private List<IComponent> components = new ArrayList<IComponent>();

    @Override
    public void sayHello(int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
        System.out.println("composite hello.");
        deep++;
        for (IComponent component : components) {
            component.sayHello(deep);
        }
    }

    @Override
    public void add(IComponent component) {
        components.add(component);
    }

    @Override
    public void remove(IComponent component) {
        components.remove(component);
    }

    @Override
    public IComponent getChild(int i) {
        return components.get(i);
    }
}

