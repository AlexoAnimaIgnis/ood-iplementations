package com.demo.designprinciples.ocp

import java.lang.IllegalArgumentException

/**
 * Open for Extension; Closed for Modification Principle
 * OCP states that a class's behavior should be extensible without modifying its existing behavior.
 */

class Rectangle(val width: Double, val height: Double)
class Circle(val radius: Double)

/**
 * This class violates the OCP because, if we were to accommodate a new shape
 * we would need to change the calculateArea() to add the computation for the new shape
 */
class AreaCalculator {
    fun calculateArea(shape: Any): Double {
        return when(shape) {
            is Rectangle -> shape.width * shape.height
            is Circle -> Math.PI * shape.radius * shape.radius
            else -> throw IllegalArgumentException("unknown shape")
        }
    }
}


fun main(){
    val calculator = AreaCalculator()
    val rectangle = Rectangle(3.0, 4.0)
    val circle = Circle(8.0)

    println("Rectangle area: ${calculator.calculateArea(rectangle)}")
    println("Circle area: ${calculator.calculateArea(circle)}")
}