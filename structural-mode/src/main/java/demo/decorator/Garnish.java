package demo.decorator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 21:37
 * @Description: 抽象装饰角色
 */
public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }
}
