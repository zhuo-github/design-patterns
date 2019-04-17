package proxy.static1;

public class RealSubject implements Subject{
    @Override
    public void insert() {
        System.out.println("插入数据库");
    }
}
