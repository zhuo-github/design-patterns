package factory.abstract3.factory;

public class Main {
    public static void main(String[] args) {
        Fruit northernFruit = new NorthernGardener().fruitFactory();
        Veggie northernVeggie = new NorthernGardener().veggieFactory();
        Fruit tropicalFruit = new TropicalGardener().fruitFactory();
        Veggie tropicalVeggie = new TropicalGardener().veggieFactory();
        System.out.println(northernFruit.position());
        System.out.println(northernVeggie.position());
        System.out.println(tropicalFruit.position());
        System.out.println(tropicalVeggie.position());
    }
}
