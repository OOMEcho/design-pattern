package demo.command;

import java.util.Map;
import java.util.Set;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 21:40
 * @Description: 具体命令角色
 */
public class OrderCommand implements Command {

    //持有接受者对象
    private final SeniorChef receiver;

    private final Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDic = order.getFoodDic();
        Set<String> keys = foodDic.keySet();
        for (String foodName : keys) {
            receiver.makeFood(foodDic.get(foodName), foodName);
        }
        try {
            Thread.sleep(100);//停顿一下 模拟做饭的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(order.getDiningTable() + "桌的饭弄好了");
    }
}
