package Creational.Factory;

public class PencilFactory extends ToolFactory{
    @Override
    public ITool createTool() {
        return new Pencil();
    }
}
