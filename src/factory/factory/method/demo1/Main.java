package factory.factory.method.demo1;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new AppleGardener().factory();
        Fruit grape = new GrapeGardener().factory();
        Fruit strawberry = new StrawberryGardener().factory();
        System.out.println(apple.name());
        System.out.println(grape.name());
        System.out.println(strawberry.name());
    }
}
