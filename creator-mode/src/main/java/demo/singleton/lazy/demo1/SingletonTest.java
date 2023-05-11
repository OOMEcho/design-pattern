package demo.singleton.lazy.demo1;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:11
 * @Description: 懒汉式测试类
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("instance1 == instance2：" + (instance1 == instance2));
        System.out.println("instance1.hashCode()：" + instance1.hashCode());
        System.out.println("instance2.hashCode()：" + instance2.hashCode());
    }
}
