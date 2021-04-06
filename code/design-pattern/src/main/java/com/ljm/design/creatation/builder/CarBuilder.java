package com.ljm.design.creatation.builder;

/**
 * @Description 具体构造器
 * @Author ljm
 * @Date 2021/4/6 18:19
 */
public class CarBuilder extends AbstractCarBuilder{
    @Override
    public AbstractCarBuilder buildName(String name) {
        this.car.setName(name);
        return this;
    }

    @Override
    public AbstractCarBuilder buildEngine(String engine) {
        this.car.setEngine(engine);
        return this;
    }

    @Override
    public AbstractCarBuilder buildColor(String color) {
        this.car.setColor(color);
        return this;
    }
}
