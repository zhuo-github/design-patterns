package singleton.lazy;

public class DoubleCheckLock {
    private static volatile DoubleCheckLock doubleCheckLock;
    private DoubleCheckLock() {}
    public static DoubleCheckLock newInstance() {
        if (doubleCheckLock == null) {
            synchronized (DoubleCheckLock.class) {
                if (doubleCheckLock == null) {
                    doubleCheckLock = new DoubleCheckLock();
                }
            }
        }
        return doubleCheckLock;
    }
}
