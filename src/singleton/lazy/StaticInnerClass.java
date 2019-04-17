package singleton.lazy;

public class StaticInnerClass {
    private StaticInnerClass(){}
    private static class Instacne{
        private static StaticInnerClass staticInnerClass=new StaticInnerClass();
    }
    public static StaticInnerClass newInstance(){
        return Instacne.staticInnerClass;
    }
}
