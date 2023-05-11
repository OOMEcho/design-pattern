package demo.factory.abstract_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 22:06
 * @Description: 抽象工厂
 */
public interface DessertFactory {

    /**
     * 创建咖啡
     *
     * @return coffee
     */
    Coffee createCoffee();

    /**
     * 创建甜品
     *
     * @return dessert
     */
    Dessert createDessert();
}
