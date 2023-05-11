package demo.factory.factory_method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 21:28
 * @Description: 咖啡测试类
 */
public class CoffeeTest {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
//        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        coffee.getName();
    }
}
