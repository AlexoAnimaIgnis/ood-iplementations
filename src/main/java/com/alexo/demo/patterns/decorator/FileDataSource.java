package com.alexo.demo.patterns.decorator;

public class FileDataSource implements DataSource {

    FileDataSource(String fileName) {

    }

    @Override
    public void writeData(String data) {

    }

    @Override
    public String readData() {
        return "";
    }
}
