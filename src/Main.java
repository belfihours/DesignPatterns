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
import structural.adapter.SquarePieceAdapter;
import structural.adapter.domain.RoundHole;
import structural.adapter.domain.RoundPiece;
import structural.adapter.domain.SquarePiece;
import structural.decorator.*;
import structural.facade.VideoConversionFacade;

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

        //region Structural

        // Adapter
        var roundHole = new RoundHole(5);
        var roundPiece = new RoundPiece(4);

        System.out.println("Round piece fits in hole: " + roundHole.fits(roundPiece));

        var smallSquarePiece = new SquarePiece(3);
        var bigSquarePiece = new SquarePiece(15);
        // roundHole.fits(smallSquarePiece); error

        var smallSquareAdapter = new SquarePieceAdapter(smallSquarePiece);
        var bigSquareAdapter = new SquarePieceAdapter(bigSquarePiece);

        System.out.println("Small square piece fits in hole: " + roundHole.fits(smallSquareAdapter));
        System.out.println("Big square fits in hole: " + roundHole.fits(bigSquareAdapter));

        // Decorator

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded =
                new CompressionDecorator(
                    new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());

        // Facade
        var videoConverterFacade = new VideoConversionFacade();
        var converted = videoConverterFacade.conertVideo("test_video.ogg", "mp4");

        //endregion


    }
}
