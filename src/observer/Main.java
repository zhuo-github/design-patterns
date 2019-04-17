package observer;

public class Main {
    public static void main(String[] args) {
        //注册观察者
        Subject subject=new ConcreteSubject();
        subject.register(new ConcreteObserver());
        subject.execute();
    }
}
