package com.demo.designprinciples.dip

/**
 * Dependency Inversion Principle states that
 * high level modules should not depend on low-level modules.
 * Both should depend on abstractions. Abstraction should not depend on details,
 * details should depend on abstractions
 */

/**
 * Example of low level module
 */
class LEDMonitor {
    fun display() {
        println("Displaying on LED Monitor")
    }
}

/**
 * Violates the DIP because the computer class directly depends on LED Monitor
 * if there is a need to switch to a different type of monitor, we need to
 * change the Computer class
 *
 * Instead, Computer class should depend on an abstraction (i.e. Monitor interface)
 * rather than the specific implementation (LEDMonitor)
 */
// High-level module directly depends on LEDMonitor
class Computer {
    val monitor = LEDMonitor()

    fun showOutput() {
        monitor.display() // dependency on a specific type of monitor
    }
}
fun main() {
    val computer = Computer()
    computer.showOutput()
}