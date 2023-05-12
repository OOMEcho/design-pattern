package demo.strategy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 19:21
 * @Description:
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
