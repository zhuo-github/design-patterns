package adapter.object;

public class Main {
    public static void main(String[] args) {
        ThreePinPlug threePinPlug = new PlugAdapter();
        boolean groundWire = threePinPlug.getGroundWire();
        System.out.println(groundWire);
    }
}
