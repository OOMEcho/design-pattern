package demo.factory.config_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:49
 * @Description: 美事咖啡
 */
public class AmericanCoffee extends Coffee {
    @Override
    public void getName() {
        System.out.println("美式咖啡");
    }
}
