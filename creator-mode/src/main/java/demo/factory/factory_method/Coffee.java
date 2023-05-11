package demo.factory.factory_method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:47
 * @Description: 咖啡类
 */
public abstract class Coffee {

    public abstract void getName();

    public void addSugar() {
        System.out.println("加糖");
    }

    public void addMilk() {
        System.out.println("加牛奶");
    }
}
