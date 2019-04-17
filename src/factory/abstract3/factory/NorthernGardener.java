package factory.abstract3.factory;

public class NorthernGardener implements Gardener {
    @Override
    public Fruit fruitFactory() {
        return new NorthernFruit();
    }

    @Override
    public Veggie veggieFactory() {
        return new NorthernVeggie();
    }
}
