package demo.memento.black_box;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 21:47
 * @Description: 备忘录对象管理者
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
