package demo.memento.white_box;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 21:48
 * @Description:
 */
public class WhiteBoxTest {
    public static void main(String[] args) {
        // 大战 Boss 前
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        // 保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        // 大战 Boss 时，损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        // 恢复之前状态
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
