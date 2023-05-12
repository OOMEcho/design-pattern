package demo.proxy.jdk_proxy;

import java.lang.reflect.Proxy;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/10 9:39
 * @Description: 获取代理对象的工厂类
 */
public class ProxyFactory {

    /**
     * 维护一个目标对象
     */
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     */
    public SellTickets getProxyInstance() {
        return (SellTickets) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK动态代理开始");
                    // 执行目标对象方法
                    Object returnValue = method.invoke(target, args);
                    System.out.println("JDK动态代理结束");
                    return returnValue;
                });
    }
}
