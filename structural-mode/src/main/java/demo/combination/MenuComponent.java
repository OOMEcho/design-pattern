package demo.combination;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 9:17
 * @Description: 抽象根节点
 */
public abstract class MenuComponent {

    protected String name;

    protected int level;

    // 添加菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 移除菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单名称
    public String getName() {
        return name;
    }

    // 获取菜单层级
    public abstract void print();
}
