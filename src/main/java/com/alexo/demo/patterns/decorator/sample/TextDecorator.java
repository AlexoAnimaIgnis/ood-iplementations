package com.alexo.demo.patterns.decorator.sample;

public abstract class TextDecorator implements TextOperation {
    private final TextOperation wrapped;

    public TextDecorator(TextOperation wrapped) {
        this.wrapped = wrapped;
    }

    /**
     * delegates to the wrapped class
     */
    @Override
    public String displayText() {
        return wrapped.displayText();
    }
}
