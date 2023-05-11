package demo.decorator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 21:31
 * @Description: 抽象构建角色
 */
public abstract class FastFood {

    //价格
    private float price;

    //描述
    private String desc;

    public FastFood() {
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public abstract float cost();
}
