package com.demo.ood.tennis


/**
 * handle normal scoring progression (0,15,30,40)
 */
class NormalScoringState : GameState {

    override fun addPoint(player: Player, opponent: Player, game: Game) {
        when (player.points) {
            0 -> player.points = 15
            15 -> player.points = 30
            30 -> player.points = 40
            40 -> {
                if (opponent.points == 40) {
                    game.setState(DeuceState()) // Move to Deuce if both reach 40
                } else {
                    game.winGame(player) // Player wins the game
                }
            }
        }
    }

    override fun getScore(player: Player, opponent: Player): String {
        return "${player.points}-${opponent.points}"
    }

}