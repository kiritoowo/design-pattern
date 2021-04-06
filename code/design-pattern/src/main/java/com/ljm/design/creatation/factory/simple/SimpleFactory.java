package com.ljm.design.creatation.factory.simple;

import com.ljm.design.creatation.factory.AbstractCar;
import com.ljm.design.creatation.factory.BenzCar;
import com.ljm.design.creatation.factory.HondaCar;

/**
 * @Description 简单工程模式
 * @Author ljm
 * @Date 2021/4/6 17:05
 */
public class SimpleFactory {

    public static AbstractCar createCar(String type) {
        switch (type) {
            case "benz":
                return new BenzCar();
            case "honda":
                return new HondaCar();
            default:
                throw new RuntimeException("type non existent");
        }
    }


}
