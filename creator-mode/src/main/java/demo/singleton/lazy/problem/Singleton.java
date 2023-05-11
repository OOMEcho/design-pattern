package demo.singleton.lazy.problem;

import java.io.Serializable;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:34
 * @Description: 懒汉式-静态内部类
 */
public class Singleton implements Serializable {

    // 私有构造函数
    private Singleton() {
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    // 静态内部类
    private static class SingletonHolder {
        // 静态内部类中创建实例对象
        private static final Singleton INSTANCE = new Singleton();
    }

    // 获取实例
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 防止序列化破坏单例
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
