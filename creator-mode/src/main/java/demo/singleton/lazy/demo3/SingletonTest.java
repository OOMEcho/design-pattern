package demo.singleton.lazy.demo3;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:37
 * @Description: 懒汉式测试类
 */
public class SingletonTest {
    public static void main(String[] args) {
        // 获取实例
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 判断是否是同一个实例
        System.out.println(instance1 == instance2);
    }
}
