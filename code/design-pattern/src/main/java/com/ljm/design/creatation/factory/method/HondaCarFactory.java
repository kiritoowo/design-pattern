package com.ljm.design.creatation.factory.method;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.HondaCar;

/**
 * @Description 本田汽车工厂
 * @Author ljm
 * @Date 2021/4/6 17:19
 */
public class HondaCarFactory extends AbstractFactory {
    @Override
    public AbstractCar createCar() {
        return new HondaCar();
    }
}
