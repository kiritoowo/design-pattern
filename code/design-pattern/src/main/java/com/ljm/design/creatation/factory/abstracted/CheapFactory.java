package com.ljm.design.creatation.factory.abstracted;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.AbstractRefrigerator;
import com.ljm.design.creatation.factory.ChangHongRefrigerator;
import com.ljm.design.creatation.factory.HondaCar;

/**
 * @Description 低价格工厂
 * @Author ljm
 * @Date 2021/4/6 17:42
 */
public class CheapFactory extends AbstractFactory {
    @Override
    public AbstractCar createCar() {
        return new HondaCar();
    }

    @Override
    public AbstractRefrigerator createRefrigerator() {
        return new ChangHongRefrigerator();
    }
}
