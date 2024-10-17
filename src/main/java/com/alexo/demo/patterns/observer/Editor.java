package com.alexo.demo.patterns.observer;

import java.io.File;

/**
 * concrete publisher contains real business logic
 * and contains the state changes that subscribers are interested
 */
public class Editor {
    public EventManager eventManagers;
    private File file;

    public Editor() {
        this.eventManagers = new EventManager("open","save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManagers.notify("open", file);
    }

    public void saveFile() throws Exception {
        if(this.file != null) {
            eventManagers.notify("save", file);
        } else {
            throw new Exception("Please open a file first");
        }
    }
}
