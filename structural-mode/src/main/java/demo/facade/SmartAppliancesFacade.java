package demo.facade;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:36
 * @Description:
 */
public class SmartAppliancesFacade {

    private final TV tv;
    private final Light light;
    private final AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.tv = new TV();
        this.light = new Light();
        this.airCondition = new AirCondition();
    }

    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的...");
        }
    }

    private void on() {
        tv.on();
        light.on();
        airCondition.on();
    }

    private void off() {
        tv.off();
        light.off();
        airCondition.off();
    }
}
