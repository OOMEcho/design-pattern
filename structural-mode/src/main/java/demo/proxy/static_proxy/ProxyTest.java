package demo.proxy.static_proxy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/10 9:08
 * @Description: 代理测试
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用代售点的卖票方法
        proxyPoint.sell();
    }
}
