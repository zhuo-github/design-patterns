package decorator;

public class Main {
    public static void main(String[] args) {
        RedWrapping redWrapping = new RedWrapping(new Flower());
        redWrapping.packing();
        System.out.println();
        BlueWrapping blueWrapping = new BlueWrapping(redWrapping);
        blueWrapping.packing();
    }
}
