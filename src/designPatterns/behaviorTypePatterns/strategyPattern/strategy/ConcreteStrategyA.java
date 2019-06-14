package designPatterns.behaviorTypePatterns.strategyPattern.strategy;

import designPatterns.behaviorTypePatterns.strategyPattern.Strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("执行算法A");
    }
}
