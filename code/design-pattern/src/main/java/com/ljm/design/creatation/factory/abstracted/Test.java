package com.ljm.design.creatation.factory.abstracted;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.AbstractRefrigerator;

/**
 * @Description 不同工厂返回不同产品 不同类型
 * @Author ljm
 * @Date 2021/4/6 17:21
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory cheapFactory = new CheapFactory();
        AbstractFactory expensiveFactory = new ExpensiveFactory();
        AbstractCar cheapCar = cheapFactory.createCar();
        AbstractRefrigerator cheapRefrigerator = cheapFactory.createRefrigerator();
        AbstractCar expensiveCar = expensiveFactory.createCar();
        AbstractRefrigerator expensiveRefrigerator = expensiveFactory.createRefrigerator();
        cheapCar.run();
        expensiveCar.run();
        cheapRefrigerator.refrigeration();
        expensiveRefrigerator.refrigeration();
    }
}
