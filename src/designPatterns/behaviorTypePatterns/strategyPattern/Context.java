package designPatterns.behaviorTypePatterns.strategyPattern;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAlgorithm(){
        this.strategy.algorithmInterface();
    }
}
