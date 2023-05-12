package demo.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 21:40
 * @Description: 请求者
 */
public class Waiter {

    //可以持有很多的命令对象
    private final List<Command> commands;

    public Waiter() {
        commands = new ArrayList<>();
    }

    public void setCommand(Command cmd) {
        commands.add(cmd);
    }

    // 发出命令 喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (Command cmd : commands) {
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
