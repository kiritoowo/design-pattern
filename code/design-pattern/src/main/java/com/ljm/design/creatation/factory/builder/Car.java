package com.ljm.design.creatation.factory.builder;

/**
 * @Description 汽车
 * @Author ljm
 * @Date 2021/4/6 16:55
 */
public class Car {

    private String name;
    private String engine;
    private String color;

    public Car() {

    }

    public Car(String name, String engine, String color) {
        this.name = name;
        this.engine = engine;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.println(this.color + "---" +this.name + "---使用---" + this.engine + "---飞奔---");
    }


}
