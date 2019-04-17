package builder;

public class Car {
    private Car() {}
    private String wheel;
    private String engine;
    public static class CarBuilder {
        Car car = new Car();
        public CarBuilder setWheel(String wheel) {
            car.setWheel(wheel);
            return this;
        }
        public CarBuilder setEngine(String engine) {
            car.setEngine(engine);
            return this;
        }
        public Car build() {
            return car;
        }
    }
    private void setWheel(String wheel) {
        this.wheel = wheel;
    }
    private void setEngine(String engine) {
        this.engine = engine;
    }
    public String getWheel() {
        return wheel;
    }
    public String getEngine() {
        return engine;
    }
}
