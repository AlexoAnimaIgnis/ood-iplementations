package com.demo.designpatterns.creational.single

/**
 * object keyword defines a class taht has only one instance which
 * is lazily created and thread safe by default
 *
 * - this class is thread safe
 * - lazily initiated upon first access.
 */
object SingletonDemo {
    var name  = "Alexo"

    fun getName() {
        println("This is a method in the singleton")
    }
}

fun main() {
    SingletonDemo.getName()
    SingletonDemo.name = "alexander"
    SingletonDemo.getName()
}