package com.demo.designpatterns.creational.factory

import java.lang.IllegalArgumentException

class VehicleFactory {
    fun createVehicle(type: String): Vehicle {
        return when(type) {
            "Car" -> Car()
            "Bike" -> Bike()
            else -> throw IllegalArgumentException("unknown vehicle")
        }
    }
}