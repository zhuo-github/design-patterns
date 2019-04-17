package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: i_zhuocanhe@cvte.com
 * @description: 被观察者监听的主题
 * @date: 2019/4/17
 * @since: 1.0
 */
public abstract class Subject {
    /**
     * 多个观察者监听一个主题
     */
    private List<Observer> list = new ArrayList<>();

    public void register(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
            return;
        }
        throw new RuntimeException("该观察者已经注册");
    }

    public void remove(Observer observer) {
        if (!list.contains(observer)) {
            list.remove(observer);
            return;
        }
        throw new RuntimeException("没有这个观察者可被移除");
    }

    public abstract void execute();

    void notifyObserver() {
        list.forEach(observer ->observer.update());
    }
}
