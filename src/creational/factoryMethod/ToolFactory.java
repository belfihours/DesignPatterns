package creational.factoryMethod;

public abstract class ToolFactory {
    public void renderTools(){
        var tool = createTool();
        tool.render();
    }

    public abstract Tool createTool();
}
