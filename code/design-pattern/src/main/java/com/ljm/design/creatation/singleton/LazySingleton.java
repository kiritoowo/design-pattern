package com.ljm.design.creatation.singleton;

/**
 * @Author: ljm
 * @Date: 2021-03-16 1:16
 * @Description: 懒汉单例模式
 * 单例模式多用于
 * 数据库连接池/线程池
 * 只需要读取一次的 如属性文件/系统变量/环境变量等
 * 上下文对象等
 *
 */
public class LazySingleton {

    private volatile static LazySingleton instance;

    /**
     * 双层判断实现单例
     * @return 单例对象
     */
    public static LazySingleton getInstanceByDoubleIf() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static LazySingleton getInstanceByInnerStaticClass() {
        return LazySingletonInner.innerInstance;
    }


    private static class LazySingletonInner {
        private final static LazySingleton innerInstance = new LazySingleton();
    }

    private LazySingleton(){}
}
