package demo.memento.black_box;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 22:02
 * @Description:
 */
public class BlackBoxTest {
    public static void main(String[] args) {
        // 大战 Boss 前
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        // 保存进度
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        // 大战 Boss 时，损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        // 恢复之前状态
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
