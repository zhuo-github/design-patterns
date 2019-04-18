package chain.of.responsibility;

public class ConcreteHandler extends Handler {
    @Override
    public void handlerRequest() {
        if(getHandler()!=null){
            System.out.println("传给下一个handler");
            getHandler().handlerRequest();
        }else {
            System.out.println("执行了这个handler");
        }
    }
}
