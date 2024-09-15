package com.demo.ood.tennis

class AdvantageState(private val advantagedPlayer: Player) : GameState {

    override fun addPoint(player: Player, opponent: Player, game: Game) {
        if (player == advantagedPlayer) {
            game.winGame(player) // Player with advantage wins
        } else {
            game.setState(DeuceState()) // Return to Deuce if the other player wins a point
        }
    }

    override fun getScore(player: Player, opponent: Player): String {
        return "Advantage ${advantagedPlayer.name}"
    }
}
