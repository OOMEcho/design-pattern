package demo.decorator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 21:33
 * @Description: 具体构建角色
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
