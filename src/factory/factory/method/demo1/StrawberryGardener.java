package factory.factory.method.demo1;

public class StrawberryGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Strawberry();
    }
}
