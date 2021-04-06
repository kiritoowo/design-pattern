package com.ljm.design.creatation.factory;

/**
 * @Description 抽象汽车产品
 * @Author ljm
 * @Date 2021/4/6 16:55
 */
public abstract class AbstractCar{

    private String name;
    private String engine;
    private String color;

    public AbstractCar(String name,String engine,String color) {
        this.name = name;
        this.engine = engine;
        this.color = color;
    }

    public void run() {
        System.out.println(this.color + "---" +this.name + "---使用---" + this.engine + "---飞奔---");
    }
}
