package demo.factory.abstract_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 22:08
 * @Description: 意大利风格工厂类
 *         用于创建意大利风格的咖啡和甜品
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
