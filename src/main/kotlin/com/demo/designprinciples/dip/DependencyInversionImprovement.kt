package com.demo.designprinciples.dip


// HIGH-LEVEL module
interface Keyboard {
    fun type(): String
}

// LOW-LEVEL module
class MechanicalKeyBoard: Keyboard {
    override fun type(): String = "Typing on mechanical keyboard"
}

// LOW-LEVEL module
class MembraneKeyboard: Keyboard {
    override fun type(): String = "Typing on membrane keyboard"
}

// HIGH-LEVEL module
class Computer1(private val keyboard: Keyboard) {
    fun typeOnKeyboard() {
        println(keyboard.type())
    }
}

fun main() {
    val mechanicalKeyboard = MechanicalKeyBoard()
    val membraneKeyboard = MembraneKeyboard()

    val computerWithMechanicalKeyBoard = Computer1(mechanicalKeyboard)
    val computerWithMembraneKeyboard = Computer1(membraneKeyboard)

    computerWithMechanicalKeyBoard.typeOnKeyboard()
    computerWithMembraneKeyboard.typeOnKeyboard()
}