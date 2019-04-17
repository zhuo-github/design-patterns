package adapter.object;

public interface ThreePinPlug {
    void setFireLine();
    void setZeroLine();
    void setGroundWire();
    boolean getFireLine();
    boolean getZeroLine();
    boolean getGroundWire();
}
