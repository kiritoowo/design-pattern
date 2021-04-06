package com.ljm.design.creatation.factory;

/**
 * @Description 抽象冰箱产品
 * @Author ljm
 * @Date 2021/4/6 17:35
 */
public abstract class AbstractRefrigerator {
    private String name;


    public AbstractRefrigerator(String name) {
        this.name = name;
    }

    public void refrigeration() {
        System.out.println(this.name + "---正在---努力制冷---");
    }
}
