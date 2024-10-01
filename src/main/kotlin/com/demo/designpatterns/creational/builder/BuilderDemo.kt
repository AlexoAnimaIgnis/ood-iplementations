package com.demo.designpatterns.creational.builder

/**
 * client code which is responsible for:
 * 1. creating builder
 * 2. passing the builder to the director
 */
fun main() {
    // constructing a wooden house
    val woodenBuilder = WoodenHouseBuilder()
    val director = Director(woodenBuilder)
    director.constructHouse()
    val woodenHouse = woodenBuilder.getHouse()
    println("Wooden House: $woodenHouse")

    // Construct a stone house
    val stoneBuilder = StoneHouseBuilder()
    val director2 = Director(stoneBuilder)
    director2.constructHouse()
    val stoneHouse = stoneBuilder.getHouse()
    println("Stone House: $stoneHouse")
}