package demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xuesong.lei
 * @Date: 2023/5/13 15:45
 * @Description: 具体主题角色类
 */
public class SubscriptionSubject implements Subject {

    // 定义一个集合用于存储多个观察者对象
    private final List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : weiXinUserList) {
            observer.update(message);
        }
    }
}
