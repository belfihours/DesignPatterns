package creational.builder;

import creational.builder.model.Car;
import creational.builder.model.CarType;
import creational.builder.model.Transmission;

public interface Builder {
    Car getCar();
    void setCarType(CarType type);
    void setWheels(int wheels);
    void setEngine(String engine);
    void setTransmission(Transmission transmission);
    void setGps();
}
