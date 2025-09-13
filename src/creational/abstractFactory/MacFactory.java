package creational.abstractFactory;

import creational.abstractFactory.interfaces.Button;
import creational.abstractFactory.interfaces.Checkbox;
import creational.abstractFactory.interfaces.GUIFactory;
import creational.abstractFactory.model.MacButton;
import creational.abstractFactory.model.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
