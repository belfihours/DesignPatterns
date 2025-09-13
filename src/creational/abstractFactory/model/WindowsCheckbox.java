package creational.abstractFactory.model;

import creational.abstractFactory.interfaces.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void onSelect() {
        System.out.println("You created a Windows Checkbox");
    }
}
