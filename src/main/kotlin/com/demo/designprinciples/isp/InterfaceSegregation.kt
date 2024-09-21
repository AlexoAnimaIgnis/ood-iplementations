package com.demo.designprinciples.isp

import java.lang.UnsupportedOperationException

/**
 * Interface Segregation Principle states that
 * a client should not depend on interfaces they don't need
 */

interface Worker {
    fun work()
    fun eat()
    fun sleep()
}

/**
 * this class violates SRP since it is implementing
 * eat() and sleep() when it is unsupported
 *
 * this leads to methods throwing exception, making this class
 * unnecessarily complex and harder to maintain.
 */
class Robot: Worker {
    override fun work() {
        println("Robot is working")
    }

    override fun eat() {
        throw UnsupportedOperationException("Robot's dont eat")
    }

    override fun sleep() {
        throw UnsupportedOperationException("Robot's dont sleep")
    }
}

fun main() {
    val robot = Robot()
    robot.work()
    robot.eat()
}