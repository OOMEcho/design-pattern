package demo.singleton.hungry.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 10:52
 * @Description: 单例模式-饿汉式-静态成员变量
 */
public class Singleton {

    // 1.构造器私有化，外部不能new
    private Singleton() {
    }

    // 2.本类内部创建对象实例
    private static final Singleton instance = new Singleton();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
