package creational.builder;

import creational.builder.model.Car;
import creational.builder.model.CarType;
import creational.builder.model.Transmission;

public class CarBuilder implements Builder{
    private CarType type;
    private int wheels;
    private String engine;
    private Transmission transmission;
    private boolean hasGps;
    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setGps() {
        this.hasGps = true;
    }

    @Override
    public Car getCar(){
        return new Car(this.type, this.wheels, this.engine, this.transmission, this.hasGps);
    }
}
