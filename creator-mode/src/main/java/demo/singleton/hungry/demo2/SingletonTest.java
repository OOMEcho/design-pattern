package demo.singleton.hungry.demo2;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 15:02
 * @Description: 静态代码块测试
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        // true
        System.out.println(instance == instance1);
    }
}
