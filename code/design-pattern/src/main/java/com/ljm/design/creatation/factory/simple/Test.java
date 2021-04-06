package com.ljm.design.creatation.factory.simple;

import com.ljm.design.creatation.factory.AbstractCar;

/**
 * @Description 不同类型获取不同产品
 * @Author ljm
 * @Date 2021/4/6 17:10
 */
public class Test {
    public static void main(String[] args) {
        AbstractCar benz = SimpleFactory.createCar("benz");
        AbstractCar honda = SimpleFactory.createCar("honda");
        benz.run();
        honda.run();
    }
}
