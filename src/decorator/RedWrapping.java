package decorator;

public class RedWrapping extends Decorator {
    public RedWrapping(Gift gift) {
        super(gift);
    }
    public void packing() {
        System.out.println("红纸");
        super.packing();
        System.out.println("红纸");
    }
}
