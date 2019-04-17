package adapter.clazz;

public class PlugAdapter extends TwoPinPlug implements ThreePinPlug{
    private boolean groundWire = false;
    @Override
    public void setGroundWire() {
        groundWire = true;
    }

    public boolean getGroundWire() {
        return groundWire;
    }
}
