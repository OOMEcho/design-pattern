package demo.combination;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 9:24
 * @Description: 叶子节点
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
