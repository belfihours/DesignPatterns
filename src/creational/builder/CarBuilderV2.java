package creational.builder;

import creational.builder.model.Car;
import creational.builder.model.CarType;
import creational.builder.model.Transmission;

public class CarBuilderV2 implements BuilderV2{
    private final Car car;

    private CarBuilderV2(){
        this.car = new Car();
    }

    public static BuilderV2 create(){
        return new CarBuilderV2();
    }
    @Override
    public Car createCar() {
        return car;
    }

    @Override
    public BuilderV2 setCarType(CarType type) {
        car.setType(type);
        return this;
    }

    @Override
    public BuilderV2 setWheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }

    @Override
    public BuilderV2 setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public BuilderV2 setTransmission(Transmission transmission) {
        car.setTransmission(transmission);
        return this;
    }

    @Override
    public BuilderV2 setGps() {
        car.setHasGps(true);
        return this;
    }
}
