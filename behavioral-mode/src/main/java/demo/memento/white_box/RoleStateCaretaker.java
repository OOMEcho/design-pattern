package demo.memento.white_box;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 21:47
 * @Description: 备忘录对象管理者
 */
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
