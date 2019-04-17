package decorator;

public class BlueWrapping extends Decorator {
    public BlueWrapping(Gift gift) {
        super(gift);
    }
    public void packing() {
        System.out.println("蓝纸");
        super.packing();
        System.out.println("蓝纸");
    }
}
