package com.demo.ood.tennis


fun main() {
    val player1 = Player("Player 1")
    val player2 = Player("Player 2")

    val game = Game(player1, player2)

    // Simulate the game
    game.addPoint(player1)
    println(game.getScore())  // Output: "15-0"

    game.addPoint(player2)
    println(game.getScore())  // Output: "15-15"

    game.addPoint(player1)
    println(game.getScore())  // Output: "30-15"

    game.addPoint(player1)
    println(game.getScore())  // Output: "40-15"

    game.addPoint(player2)
    println(game.getScore())  // Output: "40-30"

    game.addPoint(player2)
    println(game.getScore())  // Output: "Deuce"

    game.addPoint(player1)
    println(game.getScore())  // Output: "Advantage Player 1"

    game.addPoint(player1)
    println(game.getScore())  // Output: "Game won by Player 1"

    game.addPoint(player1)

}
