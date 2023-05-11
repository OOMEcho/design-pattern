package demo.factory.simple_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:49
 * @Description: 咖啡店类
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
