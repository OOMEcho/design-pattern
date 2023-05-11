package demo.proxy.static_proxy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/10 9:06
 * @Description: 代售点
 */
public class ProxyPoint implements SellTickets {

    private final TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        // 代售点收取一些服务费用
        System.out.println("代售点收取一些服务费用");
        // 售票点卖票
        trainStation.sell();
    }
}
