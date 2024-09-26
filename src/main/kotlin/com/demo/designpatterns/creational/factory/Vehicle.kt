package com.demo.designpatterns.creational.factory

/**
 * This is the base class or the Product
 */
interface Vehicle {
    fun drive(): String
}

/**
 * concrete ProductA
 */
class Car: Vehicle {
    override fun drive(): String  = "Driving a car"
}

/**
 * concrete ProductB
 */
class Bike: Vehicle {
    override fun drive(): String  = "Riding a bike"
}
