package com.ljm.design.creatation.factory.abstracted;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.AbstractRefrigerator;

/**
 * @Description 抽象工厂模式
 * @Author ljm
 * @Date 2021/4/6 17:15
 */
public abstract class AbstractFactory {
    public abstract AbstractCar createCar();
    public abstract AbstractRefrigerator createRefrigerator();
}
