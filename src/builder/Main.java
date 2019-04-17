package builder;

import builder.Car.CarBuilder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setEngine("引擎");
        carBuilder.setWheel("轮子");
        Car car = carBuilder.build();
        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
    }
}
