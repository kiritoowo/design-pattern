package com.ljm.design.creatation.factory.method;

import com.ljm.design.creatation.factory.AbstractCar;

/**
 * @Description 不同工厂造不同类型
 * @Author ljm
 * @Date 2021/4/6 17:21
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory benzCarFactory = new BenzCarFactory();
        AbstractCar benCar = benzCarFactory.createCar();
        AbstractFactory hondaCarFactory = new HondaCarFactory();
        AbstractCar hondaCar = hondaCarFactory.createCar();
        benCar.run();
        hondaCar.run();
    }
}
