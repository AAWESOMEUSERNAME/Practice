package designPatterns.behaviorTypePatterns.strategyPattern;

import designPatterns.behaviorTypePatterns.strategyPattern.strategy.ConcreteStrategyA;
import designPatterns.behaviorTypePatterns.strategyPattern.strategy.ConcreteStrategyB;
import designPatterns.behaviorTypePatterns.strategyPattern.strategy.ConcreteStrategyC;

public class Client {
    public static void main(String[] args) {
        Strategy concreteStrategyA = new ConcreteStrategyA();
        Strategy concreteStrategyB = new ConcreteStrategyB();
        Strategy concreteStrategyC = new ConcreteStrategyC();
        Context context = new Context(concreteStrategyA);
        context.doAlgorithm();
        context.setStrategy(concreteStrategyB);
        context.doAlgorithm();
        context.setStrategy(concreteStrategyC);
        context.doAlgorithm();
    }
}
