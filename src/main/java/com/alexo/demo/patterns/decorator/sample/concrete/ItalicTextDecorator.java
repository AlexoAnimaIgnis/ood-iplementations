package com.alexo.demo.patterns.decorator.sample.concrete;

import com.alexo.demo.patterns.decorator.sample.TextDecorator;
import com.alexo.demo.patterns.decorator.sample.TextOperation;

public class ItalicTextDecorator extends TextDecorator {

    public ItalicTextDecorator(TextOperation wrapped) {
        super(wrapped);
    }

    @Override
    public String displayText() {
        return "<i>" + super.displayText() + "</i>";
    }
}
