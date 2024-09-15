package com.demo.ood.tennis

/**
 * to manage the current state and track the game
 */
class Game(private val player1: Player, private val player2: Player) {
    private var state: GameState = NormalScoringState()

    // Set new state
    fun setState(newState: GameState) {
        state = newState
    }

    // Add point for a specific player
    fun addPoint(player: Player) {
        val opponent = if (player == player1) player2 else player1
        state.addPoint(player, opponent, this)
    }

    // Get the current score
    fun getScore(): String {
        return state.getScore(player1, player2)
    }

    // Handle game win logic
    fun winGame(player: Player) {
        player.gamesWon++
        player1.resetPoints()
        player2.resetPoints()
        state = NormalScoringState() // Reset to normal scoring for next game
        println("Game won by ${player.name}")
    }
}
