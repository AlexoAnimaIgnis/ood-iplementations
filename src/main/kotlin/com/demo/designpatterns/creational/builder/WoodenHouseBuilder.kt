package com.demo.designpatterns.creational.builder

/**
 * Classes inside this file implement the HouseBuilder interface.
 * Each class has a specific implementation for building a house.
 */
class WoodenHouseBuilder : HouseBuilder {
    private val house = House()

    override fun buildFoundation() {
        house.addPart("Wooden Foundation")
    }

    override fun buildStructure() {
        house.addPart("Wooden Structure")
    }

    override fun buildRoof() {
        house.addPart("Wooden Roof")
    }

    override fun buildInterior() {
        house.addPart("Wooden Interior")
    }

    override fun getHouse(): House {
        return house;
    }
}

class StoneHouseBuilder : HouseBuilder {
    private val house = House()

    override fun buildFoundation() {
        house.addPart("Stone Foundation")
    }

    override fun buildStructure() {
        house.addPart("Stone Structure")
    }

    override fun buildRoof() {
        house.addPart("Stone Roof")
    }

    override fun buildInterior() {
        house.addPart("Stone Interior")
    }

    override fun getHouse(): House {
        return house;
    }

}