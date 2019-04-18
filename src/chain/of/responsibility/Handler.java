package chain.of.responsibility;

public abstract class Handler {
    private Handler handler;
    public abstract void handlerRequest();
    public void setHandler(Handler handler){
        this.handler=handler;
    }
    public Handler getHandler(){
        return handler;
    }
}
