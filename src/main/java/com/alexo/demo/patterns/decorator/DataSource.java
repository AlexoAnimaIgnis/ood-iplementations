package com.alexo.demo.patterns.decorator;

/**
 * component interface that defines operations which can be altered
 * by decorators.
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
