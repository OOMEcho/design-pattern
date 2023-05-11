package demo.decorator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 21:42
 * @Description:
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
