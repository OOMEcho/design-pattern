package demo.factory.simple_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 20:00
 * @Description: 咖啡工厂
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee;
        switch (type) {
            case "american":
                coffee = new AmericanCoffee();
                break;
            case "latte":
                coffee = new LatteCoffee();
                break;
            default:
                throw new RuntimeException("对不起，您点的咖啡没有");
        }
        return coffee;
    }
}
