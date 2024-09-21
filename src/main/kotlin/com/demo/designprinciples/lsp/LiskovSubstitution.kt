package com.demo.designprinciples.lsp

import java.lang.UnsupportedOperationException

/**
 * Liskov Substitution Principle states that
 * an instance of a subclass must be able to substitute
 * the instance of the superclass without breaking the expected behavior
 */
open class Bird {
    open fun fly() {
        println("bird is flying")
    }
}

/**
 * This class violates the LSP because it cannot behave like a bird
 * in the method "fly()" it is throwing unsupported exception because
 * penguins cannot fly
 */
class Penguin : Bird() {
    override fun fly() {
        println("Penguins cant fly!")
        throw UnsupportedOperationException("Penguins cannot fly")
    }
}

/**
 * this method expects all the birds type to fly but Penguin class
 * does not meet the expectation.
 */
fun makeBirdFly(bird: Bird) {
    bird.fly()
}

fun main() {
    val penguin = Penguin()
    makeBirdFly(penguin)
}