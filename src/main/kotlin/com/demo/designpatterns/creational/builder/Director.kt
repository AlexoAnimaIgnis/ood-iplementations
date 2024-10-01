package com.demo.designpatterns.creational.builder

/**
 * Director class defines the order of construction steps and works with the builder passed to it.
 * Ensures that steps are called in the correct order.
 */
class Director(private val builder: HouseBuilder) {
    fun constructHouse() {
        builder.buildFoundation()
        builder.buildStructure()
        builder.buildRoof()
        builder.buildInterior()
    }
}