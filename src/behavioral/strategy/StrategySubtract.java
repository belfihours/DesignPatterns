package behavioral.strategy;

public class StrategySubtract implements Strategy{
    @Override
    public double execute(int a, int b){
        return a-b;
    }
}
