package demo.singleton.lazy.demo4;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:44
 * @Description: 测试类
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        // true
        System.out.println(singleton1 == singleton2);
    }
}
