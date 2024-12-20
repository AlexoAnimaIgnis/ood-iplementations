package com.alexo.demo.patterns.observer;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void udpate(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed "
                + eventType + " event with the following file: " + file.getName());
    }
}
