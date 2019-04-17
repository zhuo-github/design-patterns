package decorator;

public class Flower implements Gift {

    @Override
    public void packing() {
        System.out.println("花");
    }
}
