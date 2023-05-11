package demo.factory.config_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/9 10:03
 * @Description: 咖啡测试
 */
public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        coffee.getName();

        System.out.println("**************");

        Coffee coffee1 = CoffeeFactory.createCoffee("american");
        coffee1.getName();
    }
}
