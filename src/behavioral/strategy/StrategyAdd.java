package behavioral.strategy;

public class StrategyAdd implements Strategy{
    @Override
    public double execute(int a, int b) {
        return a+b;
    }
}
