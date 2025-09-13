package Creational.Factory;

public class BrushFactory extends ToolFactory{
    @Override
    public ITool createTool() {
        return new Brush();
    }
}
