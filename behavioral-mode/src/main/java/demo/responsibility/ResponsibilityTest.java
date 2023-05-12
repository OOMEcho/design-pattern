package demo.responsibility;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 23:02
 * @Description:
 */
public class ResponsibilityTest {
    public static void main(String[] args) {
        //请假条来一张
        LeaveRequest leave = new LeaveRequest("小花", 5, "身体不适");

        //各位领导
        GroupLeader groupLeader = new GroupLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        GeneralManager generalManager = new GeneralManager();

        //小组长的领导是部门经理
        groupLeader.setNextHandler(managerLeader);
        //部门经理的领导是总经理
        managerLeader.setNextHandler(generalManager);

        //提交申请
        groupLeader.submit(leave);
    }
}
