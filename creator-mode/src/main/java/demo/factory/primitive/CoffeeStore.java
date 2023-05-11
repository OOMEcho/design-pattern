package demo.factory.primitive;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:49
 * @Description: 咖啡店类
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
