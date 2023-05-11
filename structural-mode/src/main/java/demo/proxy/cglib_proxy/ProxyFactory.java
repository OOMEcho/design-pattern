package demo.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 11:23
 * @Description: 代理对象工厂
 */
public class ProxyFactory implements MethodInterceptor {

    private final TrainStation trainStation = new TrainStation();

    public TrainStation getProxyInstance() {
        // 创建一个动态类对象，即增强器，Enhancer是cglib的字节码增强器，可以方便的对类进行拓展
        Enhancer enhancer = new Enhancer();
        // 设置父类，即目标类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数，即代理对象
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---代售点收取一定的服务费---");
        return method.invoke(trainStation, objects);
    }
}
