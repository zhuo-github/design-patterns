package proxy.static1;

public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void insert() {
        System.out.println("开启事务");
        realSubject.insert();
        System.out.println("关闭事务");
    }
}
