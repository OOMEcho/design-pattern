package demo.factory.factory_method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 21:22
 * @Description: 咖啡抽象工厂
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡
     *
     * @return coffee
     */
    Coffee createCoffee();
}
