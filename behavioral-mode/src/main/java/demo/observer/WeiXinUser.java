package demo.observer;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 15:47
 * @Description: 具体观察者角色类
 */
public class WeiXinUser implements Observer {

    // 微信用户名
    private final String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }

}
