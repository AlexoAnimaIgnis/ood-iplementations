package com.alexo.demo.patterns.decorator.sample;

public class SimpleText implements TextOperation{
    private String text;

    public SimpleText(String text) {
        this.text = text;
    }

    @Override
    public String displayText() {
        return text;
    }
}
