package singleton;

public class Hungry {
    private static Hungry hungry = new Hungry();
    private Hungry() { }
    public static Hungry newInstance() {
        return hungry;
    }
}
