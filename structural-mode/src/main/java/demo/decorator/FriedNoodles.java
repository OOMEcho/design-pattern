package demo.decorator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 21:36
 * @Description: 具体构建角色
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
