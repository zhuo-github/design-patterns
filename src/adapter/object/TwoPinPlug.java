package adapter.object;

public class TwoPinPlug {
    private boolean fireLine = false;
    private boolean zeroLine = false;
    public void setFireLine(){
        fireLine = true;
    }
    public void setZeroLine(){
        zeroLine = true;
    }

    public boolean getFireLine() {
        return fireLine;
    }

    public boolean getZeroLine() {
        return zeroLine;
    }
}
