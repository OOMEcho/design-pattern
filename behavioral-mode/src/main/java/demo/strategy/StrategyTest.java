package demo.strategy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 19:23
 * @Description:
 */
public class StrategyTest {
    public static void main(String[] args) {
        new SalesMan(new StrategyA()).show();
        new SalesMan(new StrategyB()).show();
        new SalesMan(new StrategyC()).show();
    }
}
