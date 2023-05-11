package demo.singleton.lazy.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:08
 * @Description: 懒汉式-线程安全
 */
public class Singleton {

    // 1.私有化构造函数
    private Singleton() {
    }

    // 2.创建静态的类实例对象
    private static Singleton instance;

    // 3.提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static synchronized Singleton getInstance() {
        // 判断instance是否为空，如果为空则创建
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
