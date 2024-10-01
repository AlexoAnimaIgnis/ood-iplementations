package com.demo.designpatterns.creational.builder

/**
 * Represents the object being constructed
 */
class House {
    private val parts = mutableListOf<String>()

    fun addPart(part: String) {
        parts.add(part)
    }

    override fun toString(): String {
        return "House parts: ${parts.joinToString(", ")}}"
    }
}