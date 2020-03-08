package com.zhangdy.design.pattern.composite;

public class TestComposite {

    public static void main(String[] args) {

        // 建立树
        IComponent root = new Composite();

        IComponent secondNode1 = new Composite();
        root.add(secondNode1);

        IComponent thirdNode = new Composite();
        thirdNode.add(new Leaf());
        thirdNode.add(new Leaf());
        secondNode1.add(thirdNode);
        secondNode1.add(new Leaf());
        secondNode1.add(new Leaf());

        IComponent secondNode2 = new Composite();
        secondNode2.add(new Leaf());
        root.add(secondNode2);

        root.add(new Leaf());
        root.add(new Leaf());
        root.add(new Leaf());


        // 执行
        root.sayHello(0);
    }
}
