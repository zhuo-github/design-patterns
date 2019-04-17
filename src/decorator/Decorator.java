package decorator;

public class Decorator implements Gift {
    private Gift gift;

    public Decorator(Gift gift) {
        this.gift = gift;

    }

    public void packing() {
        //要有多层包装的效果关键在于调用聚合的对象的方法，而不是调用父类的。
        gift.packing();
    }
}
