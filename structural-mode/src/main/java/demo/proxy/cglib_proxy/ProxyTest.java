package demo.proxy.cglib_proxy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 11:29
 * @Description: 测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 创建代理对象
        TrainStation proxyInstance = new ProxyFactory().getProxyInstance();
        // 调用代理对象的sell方法
        proxyInstance.sell();
    }
}
