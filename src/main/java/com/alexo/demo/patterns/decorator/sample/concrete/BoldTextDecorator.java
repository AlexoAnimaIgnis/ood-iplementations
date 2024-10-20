package com.alexo.demo.patterns.decorator.sample.concrete;

import com.alexo.demo.patterns.decorator.sample.TextDecorator;
import com.alexo.demo.patterns.decorator.sample.TextOperation;

public class BoldTextDecorator extends TextDecorator {

    public BoldTextDecorator(TextOperation wrapped) {
        super(wrapped);
    }

    @Override
    public String displayText() {
        return "<b>" + super.displayText() + "</b>";
    }
}
