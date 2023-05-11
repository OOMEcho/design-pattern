package demo.factory.primitive;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/8 19:48
 * @Description: 拿铁咖啡
 */
public class LatteCoffee extends Coffee{
    @Override
    public void getName() {
        System.out.println("拿铁咖啡");
    }
}
