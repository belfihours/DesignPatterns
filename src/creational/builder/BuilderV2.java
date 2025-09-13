package creational.builder;

import creational.builder.model.Car;
import creational.builder.model.CarType;
import creational.builder.model.Transmission;

public interface BuilderV2 {
    Car createCar();
    BuilderV2 setCarType(CarType type);
    BuilderV2 setWheels(int wheels);
    BuilderV2 setEngine(String engine);
    BuilderV2 setTransmission(Transmission transmission);
    BuilderV2 setGps();
}
