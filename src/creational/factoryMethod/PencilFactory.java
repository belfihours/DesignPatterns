package creational.factoryMethod;

public class PencilFactory extends ToolFactory{
    @Override
    public Tool createTool() {
        return new Pencil();
    }
}
