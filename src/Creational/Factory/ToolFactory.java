package Creational.Factory;

public abstract class ToolFactory {
    public void renderTools(){
        var tool = createTool();
        tool.render();
    }

    public abstract ITool createTool();
}
