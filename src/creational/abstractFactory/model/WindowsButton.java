package creational.abstractFactory.model;

import creational.abstractFactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("You created a Windows Button");
    }
}
