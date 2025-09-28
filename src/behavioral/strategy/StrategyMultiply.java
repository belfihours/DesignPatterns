package behavioral.strategy;

public class StrategyMultiply implements Strategy{
    @Override
    public double execute(int a, int b){
        return a*b;
    }
}
