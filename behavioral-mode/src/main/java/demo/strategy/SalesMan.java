package demo.strategy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 19:22
 * @Description:
 */
public class SalesMan {

    private final Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.show();
    }
}
