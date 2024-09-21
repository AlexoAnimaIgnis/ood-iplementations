package com.demo.designprinciples.isp


/**
 * to solve the issue with the previous ISP classes
 * we need to segregate the interface for different functionality
 */
interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

class Robot1: Workable {
    override fun work() {
        println("robot1 is working")
    }
}

class Human: Workable, Eatable {
    override fun work() {
        println("human is working")
    }

    override fun eat() {
        println("human is eating")
    }

}

fun main() {
    val human = Human()
    val robot1 = Robot1()

    human.eat()
    human.work()
    robot1.work()
}