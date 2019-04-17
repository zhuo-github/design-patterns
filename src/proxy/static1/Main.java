package proxy.static1;

public class Main {
    public static void main(String[] args) {
        Subject subject=new ProxySubject(new RealSubject());
        subject.insert();
    }
}
