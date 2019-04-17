package factory.factory.method.demo1;

public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
