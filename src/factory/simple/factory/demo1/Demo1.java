package factory.simple.factory.demo1;

public class Demo1 {
    public static void main(String[] args) {
        Fruit apple = FruitGardener.factory(FruitEnum.APPLE);
        Fruit grape = FruitGardener.factory(FruitEnum.GRAPE);
        Fruit strawberry = FruitGardener.factory(FruitEnum.STRAWBERRY);
        System.out.println(apple.name());
        System.out.println(grape.name());
        System.out.println(strawberry.name());
    }
}
