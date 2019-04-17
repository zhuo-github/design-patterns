package factory.factory.method.demo1;

public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
