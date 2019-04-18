package memento;

public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        o.setState("on");
        c.saveMemento(o.createMemento());
        o.setState("off");
        o.restoreMemento(c.retrieveMemento());
    }
}
