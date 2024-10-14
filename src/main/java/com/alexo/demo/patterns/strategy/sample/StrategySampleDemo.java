package com.alexo.demo.patterns.strategy.sample;

public class StrategySampleDemo {

    public static void main(String[] args) {
        Strategy addStrat = new ConcreteStrategyAdd();
        Strategy subStrat = new ConcreteStrategySubtract();
        Strategy multiplyStrat = new ConcreteStrategyMultiply();

        Context addContext = new Context(addStrat);
        System.out.println(addContext.executeStrategy(1, 2));

        Context subContext = new Context(subStrat);
        System.out.println(subContext.executeStrategy(1, 2));

        Context multiContext = new Context(multiplyStrat);
        System.out.println(multiContext.executeStrategy(1, 2));
    }
}
