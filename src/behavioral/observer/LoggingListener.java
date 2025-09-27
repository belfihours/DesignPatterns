package behavioral.observer;

public class LoggingListener implements EventListener {
    @Override
    public void update() {
        System.out.println("Log: something changed");
    }
}
