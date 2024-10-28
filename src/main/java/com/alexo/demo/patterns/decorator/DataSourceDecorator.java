package com.alexo.demo.patterns.decorator;

/**
 * Base decorator class.
 *
 * Primary purpose of this class is to define the wrapping interface for all
 * concrete decorators.
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrapped;

    public DataSourceDecorator(DataSource dataSource) {
        this.wrapped = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrapped.writeData(data);
    }

    @Override
    public String readData() {
        return wrapped.readData();
    }
}
