package demo.singleton.lazy.problem;

import java.lang.reflect.Constructor;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 16:38
 * @Description: 反射测试
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        // 获取类对象
        Class<Singleton> clazz = Singleton.class;
        // 获取私有构造函数
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        // 设置可访问
        cons.setAccessible(true);
        // 创建实例对象
        Singleton singleton1 = cons.newInstance();
        Singleton singleton2 = cons.newInstance();
        System.out.println("singleton1 == singleton2：" + (singleton1 == singleton2));

    }
}
