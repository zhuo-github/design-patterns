package builder;

public class LaptopBuilder implements ComputerBuilder {
    private Computer laptop = new Laptop();
    private boolean isBuildCPU = false;
    private boolean isBuildGraphicsCard = false;
    @Override
    public void buildCPU() {
        if (!isBuildCPU) {
            laptop.add("组装笔记本型号的cpu");
            isBuildCPU = true;
        }
    }
    @Override
    public void buildGraphicsCard() {
        if (!isBuildGraphicsCard) {
            laptop.add("组装笔记本型号的显卡");
            isBuildGraphicsCard = true;
        }
    }
    @Override
    public Computer retrieveResult() {
        return laptop;
    }
}
