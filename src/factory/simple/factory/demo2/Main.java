package factory.simple.factory.demo2;

public class Main {
    public static void main(String[] args) {
        Apple apple = FruitGardener.appleFactory();
        System.out.println(apple);
    }
}
