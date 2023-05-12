package demo.combination;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/12 9:25
 * @Description:
 */
public class CombinationTest {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 1);
        MenuComponent menu2 = new Menu("权限管理", 1);
        MenuComponent menu3 = new Menu("系统管理", 1);

        MenuComponent item1 = new MenuItem("用户管理", 2);
        MenuComponent item2 = new MenuItem("角色管理", 2);
        MenuComponent item3 = new MenuItem("菜单管理", 2);
        MenuComponent item4 = new MenuItem("权限管理", 2);
        MenuComponent item5 = new MenuItem("系统日志", 2);

        menu1.add(item1);
        menu1.add(item2);
        menu2.add(item3);
        menu2.add(item4);
        menu3.add(item5);

        MenuComponent component = new Menu("总菜单", 0);
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        component.print();
    }
}
