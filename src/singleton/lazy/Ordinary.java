package singleton.lazy;

public class Ordinary {
    private Ordinary(){};
    synchronized public static Ordinary newInstance(){
        return new Ordinary();
    }
}
