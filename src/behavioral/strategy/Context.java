package behavioral.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public double execute(int a, int b){
        if(strategy==null){
            return 0;
        }
        return this.strategy.execute(a, b);
    }
}
