package factory.simple.factory.demo1;

public class FruitGardener {
    public static Fruit factory(FruitEnum fruit) {
        switch (fruit) {
            case APPLE:
                return new Apple();
            case GRAPE:
                return new Grape();
            case STRAWBERRY:
                return new Strawberry();
            default:
                throw new RuntimeException("没有这种水果");
        }
    }
}
