package com.alexo.demo.patterns.observer;

import java.io.File;

/**
 * Subscriber interface
 */
public interface EventListener {
    void udpate(String eventType, File file);
}
