package creational.factoryMethod;

public class BrushFactory extends ToolFactory{
    @Override
    public Tool createTool() {
        return new Brush();
    }
}
