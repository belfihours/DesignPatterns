import creational.abstractFactory.interfaces.Button;
import creational.abstractFactory.interfaces.Checkbox;
import creational.abstractFactory.interfaces.GUIFactory;
import creational.abstractFactory.WindowsFactory;
import creational.builder.Builder;
import creational.builder.CarBuilder;
import creational.builder.CarBuilderV2;
import creational.builder.model.Car;
import creational.builder.model.CarType;
import creational.builder.model.Transmission;
import creational.factoryMethod.BrushFactory;
import creational.factoryMethod.PencilFactory;
import creational.factoryMethod.ToolFactory;
import creational.SingletonDB;

public class Main {
    public static void main(String[] args) {

        //region Creational

        // Singleton
        SingletonDB db1 = SingletonDB.getInstance();
        SingletonDB db2 = SingletonDB.getInstance();
        System.out.println(db1.getSeq()==db2.getSeq()); //should be true

        // Factory Method
        ToolFactory factory;
        if (args.length>0 && args[0].equals("Pencil")) {
            factory = new PencilFactory();
        } else {
            factory = new BrushFactory();
        }
        factory.renderTools();

        // Abstract Factory
        Button button;
        Checkbox checkbox;
        // The IGUIFactory is intended to be injected
        GUIFactory abstractFactory = new WindowsFactory();
        button = abstractFactory.createButton();
        checkbox = abstractFactory.createCheckbox();

        // Builder

        Builder builder = new CarBuilder();
        builder.setCarType(CarType.AUTOMATIC);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setWheels(4);
        builder.setEngine("my-engine");
        builder.setGps();
        Car car1 = builder.getCar();

        Car car2 = CarBuilderV2.create()
                .setCarType(CarType.MANUAL)
                .setTransmission(Transmission.MANUAL)
                .setWheels(2)
                .setEngine("second-engine")
                .createCar();

        System.out.println(car1);
        System.out.println(car2);

        //endregion

    }
}
