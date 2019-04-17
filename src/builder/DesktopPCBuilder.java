package builder;

public class DesktopPCBuilder implements ComputerBuilder {
    private Computer desktopPC = new DesktopPC();
    private boolean isBuildCPU = false;
    private boolean isBuildGraphicsCard = false;
    @Override
    public void buildCPU() {
        if (!isBuildCPU) {
            desktopPC.add("组装台式型号的cpu");
            isBuildCPU = true;
        }
    }
    @Override
    public void buildGraphicsCard() {
        if (!isBuildGraphicsCard) {
            desktopPC.add("组装台式型号的显卡");
            isBuildGraphicsCard = true;
        }
    }
    @Override
    public Computer retrieveResult() {
        return desktopPC;
    }
}
