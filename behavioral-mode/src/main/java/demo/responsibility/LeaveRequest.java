package demo.responsibility;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 22:53
 * @Description: 请假条类
 */
public class LeaveRequest {

    //姓名
    private final String name;

    //请假天数
    private final int num;

    //请假内容
    private final String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
