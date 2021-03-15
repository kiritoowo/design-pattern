package com.ljm.design.creatation.singleton;

/**
 * @Author: ljm
 * @Date: 2021-03-16 1:16
 * @Description:
 */
public class LazySingleton {

    private volatile static LazySingleton instance;

    /**
     * 双层判断实现单例
     * @return
     */
    private static LazySingleton getInstanceByDoubleIf() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    private static LazySingleton getInstanceByInnerStaticClass() {
        return LazySingletonInner.innerInstance;
    }


    private static class LazySingletonInner {
        private final static LazySingleton innerInstance = new LazySingleton();
    }

    private LazySingleton(){}
}
