package observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("被观察的主题更新了");
    }
}
