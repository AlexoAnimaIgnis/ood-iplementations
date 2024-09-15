package com.demo.ood.tennis

class DeuceState : GameState {

    override fun addPoint(player: Player, opponent: Player, game: Game) {
        game.setState(AdvantageState(player)) // Move to Advantage
    }

    override fun getScore(player: Player, opponent: Player): String {
        return "Deuce"
    }
}
