package com.demo.designprinciples.srp

/**
 * Responsible for managing user data
 */
data class User(val name: String, val email: String)

/**
 * Responsible for managing database transactions
 */
class UserRepository {
    fun saveUser(user: User) {
        println("user saved to db: ${user.name}")
    }
}

/**
 * Responsible for sending email to user
 */
class UserNotification {
    fun sendEmailToUser(user: User) {
        println("sending email to user with email ${user.email}")
    }
}

fun main() {
    val user = User("alexo", "alexo@example.com")
    val userRepository = UserRepository()
    val userNotification = UserNotification()

    userRepository.saveUser(user)
    userNotification.sendEmailToUser(user)
}