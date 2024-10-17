package com.alexo.demo.patterns.observer;

public class Application {

    public static void main(String[] args) {
        Editor editor = new Editor(); // concrete publisher
        editor.eventManagers.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.eventManagers.subscribe("save", new EmailNotificationListener("alexo@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
