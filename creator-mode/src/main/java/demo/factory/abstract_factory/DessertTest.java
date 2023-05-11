package demo.factory.abstract_factory;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 22:11
 * @Description: 甜品测试类
 */
public class DessertTest {
    public static void main(String[] args) {
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Dessert dessert = factory.createDessert();
        Coffee coffee = factory.createCoffee();
        dessert.show();
        coffee.getName();
    }
}
