package demo.observer;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 15:48
 * @Description:
 */
public class ObserverTest {
    public static void main(String[] args) {
        // 创建主题对象
        SubscriptionSubject subject = new SubscriptionSubject();

        // 创建微信用户
        subject.attach(new WeiXinUser("张三"));
        subject.attach(new WeiXinUser("李四"));
        subject.attach(new WeiXinUser("王二"));

        // 发送消息
        subject.notify("你好！");

    }
}
