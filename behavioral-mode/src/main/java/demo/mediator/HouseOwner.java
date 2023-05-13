package demo.mediator;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 17:07
 * @Description: 同事角色类
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主:" + name + ",获得信息：" + message);
    }
}
