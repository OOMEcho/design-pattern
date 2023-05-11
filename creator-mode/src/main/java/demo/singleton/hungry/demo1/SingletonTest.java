package demo.singleton.hungry.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 10:55
 * @Description: 饿汉式测试类
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
