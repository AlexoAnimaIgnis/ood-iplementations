package com.alexo.demo.patterns.strategy.sample;

public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
