package adapter.object;

public class PlugAdapter implements ThreePinPlug {
    private TwoPinPlug twoPinPlug;
    private boolean groundWire = false;
    @Override
    public void setFireLine() {
        twoPinPlug.setFireLine();
    }
    @Override
    public void setZeroLine() {
        twoPinPlug.setZeroLine();
    }
    @Override
    public boolean getFireLine() {
        return twoPinPlug.getFireLine();
    }
    @Override
    public boolean getZeroLine() {
        return twoPinPlug.getZeroLine();
    }
    @Override
    public void setGroundWire() {
        groundWire = true;
    }
    public boolean getGroundWire() {
        return groundWire;
    }
}
