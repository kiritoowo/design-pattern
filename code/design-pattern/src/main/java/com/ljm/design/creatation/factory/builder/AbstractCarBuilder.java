package com.ljm.design.creatation.factory.builder;

/**
 * @Description 抽象构造器
 * @Author ljm
 * @Date 2021/4/6 18:08
 */
public abstract class AbstractCarBuilder {
    Car car;

    public AbstractCarBuilder() {
        car = new Car("默认品牌","默认引擎","默认颜色");
    }

    public abstract AbstractCarBuilder buildName(String name);
    public abstract AbstractCarBuilder buildEngine(String engine);
    public abstract AbstractCarBuilder buildColor(String color);

    public Car builder() {
        return car;
    }
}
