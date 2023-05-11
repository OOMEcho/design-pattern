package demo.proxy.jdk_dynamic_proxy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/10 9:06
 * @Description: 火车站售票点
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
