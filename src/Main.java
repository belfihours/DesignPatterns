import Creational.Factory.BrushFactory;
import Creational.Factory.PencilFactory;
import Creational.Factory.ToolFactory;
import Creational.SingletonDB;

public class Main {
    public static void main(String[] args) {

        //region Creational

        // Singleton
        SingletonDB db1 = SingletonDB.getInstance();
        SingletonDB db2 = SingletonDB.getInstance();
        System.out.println(db1.getSeq()==db2.getSeq()); //should be true

        // Factory
        ToolFactory factory;
        if (args.length>0 && args[0].equals("Pencil")) {
            factory = new PencilFactory();
        } else {
            factory = new BrushFactory();
        }
        factory.renderTools();

        //endregion

    }
}
