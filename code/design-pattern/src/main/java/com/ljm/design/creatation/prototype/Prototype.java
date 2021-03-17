package com.ljm.design.creatation.prototype;

import java.io.*;

/**
 * @Author: ljm
 * @Date: 2021-03-18 1:10
 * @Description: 原型模式
 * 指不直接返回对象 而返回对象的克隆
 * 原型模式多用于
 * 当一个对象被多处读取且修改 并且修改不可影响其他程序时
 * 注意深浅拷贝问题
 */
public class Prototype implements Cloneable {

    /**
     * 直接重写克隆方法
     * !!! 此处为潜拷贝 也就是赋值方式
     * @return 克隆对象
     * @throws CloneNotSupportedException
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    /**
     * 深克隆自己
     * @return 克隆对象
     */
    public Prototype deepClone() throws IOException, ClassNotFoundException {
        return Prototype.deepClone(this);
    }

    /**
     *
     * @param val 要克隆的对象
     * @param <T> 要克隆对象泛型
     * @return 克隆对象
     * @throws IOException 流读取/写入失败
     * @throws ClassNotFoundException 找不到 <T> class
     */
    public static <T> T deepClone(T val) throws IOException, ClassNotFoundException {
        // 对象 -> 流
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(val);
        // 流 -> 对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
        return (T)inputStream.readObject();
    }
}
