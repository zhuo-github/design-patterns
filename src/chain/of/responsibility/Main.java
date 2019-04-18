package chain.of.responsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        Handler handler3 = new ConcreteHandler();
        Handler handler4 = new ConcreteHandler();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler3.setHandler(handler4);
        handler1.handlerRequest();
    }
}
