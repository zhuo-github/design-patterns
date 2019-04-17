package factory.abstract3.factory;

public class TropicalGardener implements Gardener{
    @Override
    public Fruit fruitFactory() {
        return new TropicalFruit();
    }

    @Override
    public Veggie veggieFactory() {
        return new TropicalVeggie();
    }
}
