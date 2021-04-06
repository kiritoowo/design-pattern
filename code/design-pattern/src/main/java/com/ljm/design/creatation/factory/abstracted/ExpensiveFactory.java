package com.ljm.design.creatation.factory.abstracted;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.AbstractRefrigerator;
import com.ljm.design.creatation.factory.BenzCar;
import com.ljm.design.creatation.factory.HaierRefrigerator;

/**
 * @Description 高价格工厂
 * @Author ljm
 * @Date 2021/4/6 17:41
 */
public class ExpensiveFactory extends AbstractFactory {
    @Override
    public AbstractCar createCar() {
        return new BenzCar();
    }

    @Override
    public AbstractRefrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }
}
