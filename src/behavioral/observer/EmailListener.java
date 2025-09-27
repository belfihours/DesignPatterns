package behavioral.observer;

public class EmailListener implements EventListener {
    @Override
    public void update() {
        System.out.println("Email: something changed");
    }
}
