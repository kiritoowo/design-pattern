package com.ljm.design.creatation.factory.method;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.BenzCar;

/**
 * @Description 宝马汽车工厂
 * @Author ljm
 * @Date 2021/4/6 17:17
 */
public class BenzCarFactory extends AbstractFactory {

    @Override
    public AbstractCar createCar() {
        return new BenzCar();
    }
}
