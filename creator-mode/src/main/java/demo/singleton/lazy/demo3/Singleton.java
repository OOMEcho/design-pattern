package demo.singleton.lazy.demo3;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:34
 * @Description: 懒汉式-静态内部类
 */
public class Singleton {

    // 私有构造函数
    private Singleton() {
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
}
