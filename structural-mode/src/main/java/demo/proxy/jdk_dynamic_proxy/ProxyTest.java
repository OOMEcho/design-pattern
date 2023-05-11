package demo.proxy.jdk_dynamic_proxy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/10 9:45
 * @Description: 代理测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 创建代理对象，同时将火车站售票点对象传递给代理对象
        ProxyFactory proxyPoint = new ProxyFactory(new TrainStation());
        // 创建代售点对象
        SellTickets sellTickets = proxyPoint.getProxyInstance();
        // 调用代理对象的卖票方法
        sellTickets.sell();
    }
}
