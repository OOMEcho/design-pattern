package demo.visit;


/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 20:48
 * @Description: 抽象元素角色
 */
public interface Animal {

    // 接受访问者
    void accept(Person person);
}
