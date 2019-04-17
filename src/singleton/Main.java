package singleton;

import singleton.lazy.DoubleCheckLock;
import singleton.lazy.StaticInnerClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("hhh");
        StaticInnerClass staticInnerClass = StaticInnerClass.newInstance();
        StaticInnerClass staticInnerClass1 = StaticInnerClass.newInstance();
        System.out.println(staticInnerClass);
        System.out.println(staticInnerClass1);
        DoubleCheckLock doubleCheckLock = DoubleCheckLock.newInstance();
        DoubleCheckLock doubleCheckLock1 = DoubleCheckLock.newInstance();
        System.out.println(doubleCheckLock);
        System.out.println(doubleCheckLock1);
    }
}
