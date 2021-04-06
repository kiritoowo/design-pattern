package com.ljm.design.creatation.builder;

/**
 * @Description 构造者模式测试
 * @Author ljm
 * @Date 2021/4/6 18:21
 */
public class Test {
    public static void main(String[] args) {
        Car car = new CarBuilder().buildName("特斯拉").buildColor("银色").buildEngine("电动车单速变速箱").builder();
        car.run();
    }
}
