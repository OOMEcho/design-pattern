package demo.singleton.lazy.demo2;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:18
 * @Description: 懒汉式-双重检查锁
 */
public class Singleton {

    // 1.私有化构造函数
    private Singleton() {
    }

    // 2.创建静态的类实例对象
    private static volatile Singleton instance;

    // 3.提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static Singleton getInstance() {
        // 判断instance是否为空，如果为空则创建
        if (instance == null) {
            // 加锁
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }

            }
        }
        return instance;
    }
}
