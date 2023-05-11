package demo.factory.abstract_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 22:07
 * @Description: 美式风格工厂类
 *        用于创建美式风格的咖啡和甜品
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
