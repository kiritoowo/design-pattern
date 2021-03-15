package com.ljm.design.creatation.singleton;

/**
 * @Author: ljm
 * @Date: 2021-03-16 1:10
 * @Description: 饿汉单例模式
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private static HungrySingleton getInstance() {
        return instance;
    }

    private HungrySingleton(){}
}
