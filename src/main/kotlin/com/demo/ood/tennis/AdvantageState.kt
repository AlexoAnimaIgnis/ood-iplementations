package com.demo.ood.tennis

class AdvantageState(
    private val advantagedPlayer: Player,
    private val game: Game
) : GameState {

    override fun addPoint(player: Player, opponent: Player, game: Game) {
        if(player == advantagedPlayer) {
            game.winGame(player)
        } else {
            game.setState(DeuceGameState(game))
        }
    }

    override fun getScore(player: Player, opponent: Player): String {
        return "advantage ${advantagedPlayer.name}"
    }
}