package com.demo.ood.tennis

class DeuceGameState(private val game: Game): GameState {
    override fun addPoint(player: Player, opponent: Player, game: Game) {
        game.setState(AdvantageState(player, game))
    }

    override fun getScore(player: Player, opponent: Player): String {
        return "Deuce"
    }
}