package com.demo.designprinciples.ocp

/**
 * The shape class is Open for Extension as a new shape
 * can be accommodated without changing the base class
 *
 * closed for modification as we dont need to alter the shape class
 */
abstract class Shape {
    abstract fun area(): Double
}

class Circle1(private val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
}

class Rectangle1(private val height: Double, private val width: Double) : Shape() {
    override fun area(): Double = height * width

}

fun main() {
    val shapes = listOf(
        Circle1(5.0),
        Rectangle1(3.0, 5.0)
    )
    shapes.forEach {
        println("Area: ${it.area()}")
    }
}