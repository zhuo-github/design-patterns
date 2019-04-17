package observer;

public class ConcreteSubject extends Subject {
    @Override
    public void execute() {
        System.out.println("实体的主题执行了");
        //通知观察者
        notifyObserver();
    }
}
