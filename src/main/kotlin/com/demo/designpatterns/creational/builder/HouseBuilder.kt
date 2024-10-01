package com.demo.designpatterns.creational.builder

/**
 * Defines the steps that are common for building different types of houses
 */
interface HouseBuilder {
    fun buildFoundation()
    fun buildStructure()
    fun buildRoof()
    fun buildInterior()
    fun getHouse(): House
}