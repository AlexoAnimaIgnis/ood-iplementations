package com.demo.designprinciples.s

/**
 * this class breaks the SRP Principle as it does a lot of things unrelated.
 * SRP states that a class/module should only have one reason for change.
 * if we need to change how it sends email or how it saves user, then we'll
 * need to modify this class
 *
 */
class UserManager {
    // manage user data
    fun createUser(name: String, email:String) {
        println("user created: Name = $name, Email = $email")
    }

    // saves user data
    fun saveData(name: String) {
        println("user $name saved to database")
    }

    // sends notification
    fun sendWelcomeEmail(email: String) {
        println("sending email to $email")
    }
}

fun main() {
    val userManager = UserManager()
    userManager.createUser("alexander", "a@gmail.com")
    userManager.saveData("alexander")
    userManager.sendWelcomeEmail("a@gmail.com")
}