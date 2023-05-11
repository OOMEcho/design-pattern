package demo.factory.factory_method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:49
 * @Description: 咖啡店类
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
