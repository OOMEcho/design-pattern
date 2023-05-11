package demo.facade;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/11 22:37
 * @Description:
 */
public class FacadeTest {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开");

        System.out.println("=================");

        smartAppliancesFacade.say("关闭");
        smartAppliancesFacade.say("我想看电视");
    }
}
