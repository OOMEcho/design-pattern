package demo.strategy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 19:22
 * @Description:
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满300减100");
    }
}
