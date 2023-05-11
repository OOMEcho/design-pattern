package demo.factory.factory_method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 21:23
 * @Description: 美式咖啡工厂实现类
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
