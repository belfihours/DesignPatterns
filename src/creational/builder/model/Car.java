package creational.builder.model;

public class Car {
    private CarType type;
    private int wheels;
    private String engine;
    private Transmission transmission;
    private boolean hasGps;

    public Car() { }

    public Car(CarType type, int wheels, String engine, Transmission transmission, boolean hasGps) {
        this.type = type;
        this.wheels = wheels;
        this.engine = engine;
        this.transmission = transmission;
        this.hasGps = hasGps;
    }

    public CarType getType() {
        return type;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public boolean isHasGps() {
        return hasGps;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setHasGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", wheels=" + wheels +
                ", engine='" + engine + '\'' +
                ", transmission=" + transmission +
                ", hasGps=" + hasGps +
                '}';
    }
}
