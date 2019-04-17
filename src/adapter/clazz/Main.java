package adapter.clazz;

public class Main {
    public static void main(String[] args) {
        ThreePinPlug plugAdapter = new PlugAdapter();
        plugAdapter.setGroundWire();
        boolean groundWire = plugAdapter.getGroundWire();
        System.out.println(groundWire);
    }
}
