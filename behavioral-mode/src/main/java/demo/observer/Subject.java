package demo.observer;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 15:42
 * @Description: 抽象主题角色类
 */
public interface Subject {

    // 添加观察者
    void attach(Observer observer);

    // 删除观察者
    void detach(Observer observer);

    // 通知观察者更新消息
    void notify(String message);
}
