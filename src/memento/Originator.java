package memento;

public class Originator {
    private String state;
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
    }
    public MementoIF createMemento(){
        return new Memento(state);
    }
    /**
     * 发起人恢复到备忘录对象记录的状态
     */
    public void restoreMemento(MementoIF memento){
        this.setState(((Memento)memento).getState());
    }
    private class Memento implements MementoIF{
        private String state;
        /**
         * 构造方法
         */
        private Memento(String state){
            this.state = state;
        }
        private String getState() {
            return state;
        }
        private void setState(String state) {
            this.state = state;
        }
    }
}
