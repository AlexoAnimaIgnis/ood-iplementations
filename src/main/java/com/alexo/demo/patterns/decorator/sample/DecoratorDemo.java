package com.alexo.demo.patterns.decorator.sample;

import com.alexo.demo.patterns.decorator.sample.concrete.BoldTextDecorator;
import com.alexo.demo.patterns.decorator.sample.concrete.ItalicTextDecorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        TextOperation simpleText = new SimpleText("Hello World");
        TextOperation boldText = new BoldTextDecorator(simpleText);
        TextOperation italicText = new ItalicTextDecorator(boldText);

        System.out.println(italicText.displayText());
    }
}
