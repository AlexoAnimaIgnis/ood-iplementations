package com.demo.designpatterns.creational.factory

/**
 * Instead of directly creating objects, client code calls the factory
 * to get the desired product.
 */
fun main() {
    val factory = VehicleFactory()

    val car: Vehicle = factory.createVehicle("Car")
    val bike: Vehicle = factory.createVehicle("Bike")

    println(car.drive())
    println(bike.drive())
}