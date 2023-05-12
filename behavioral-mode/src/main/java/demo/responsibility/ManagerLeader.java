package demo.responsibility;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 23:02
 * @Description:
 */
public class ManagerLeader extends Handler {
    public ManagerLeader() {
        //部门经理处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
