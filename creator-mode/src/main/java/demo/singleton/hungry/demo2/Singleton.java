package demo.singleton.hungry.demo2;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:01
 * @Description: 单例模式-饿汉式-静态代码块
 */
public class Singleton {

    // 私有化构造函数
    private Singleton() {
    }

    // 创建静态对象
    private static Singleton instance;

    // 在静态代码块中创建对象
    static {
        instance = new Singleton();
    }

    // 提供公共的访问方式
    public static Singleton getInstance() {
        return instance;
    }
}
