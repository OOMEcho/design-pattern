package demo.factory.simple_factory;


/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:50
 * @Description: 咖啡测试
 */
public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("latte");
        coffee.getName();
    }
}
