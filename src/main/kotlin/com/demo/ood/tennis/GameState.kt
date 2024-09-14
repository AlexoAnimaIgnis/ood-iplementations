package com.demo.ood.tennis


interface GameState {
    fun addPoint(player: Player, opponent: Player, game: Game)
    fun getScore(player: Player, opponent: Player): String
}

/**
 * handle normal scoring progression (0,15,30,40)
 */
class NormalGameState(private val game: Game) : GameState {
    override fun addPoint(player: Player, opponent: Player, game: Game) {
        when(player.points) {
            0 -> player.points = 15
            15 -> player.points = 30
            30 -> player.points = 40
            40 -> {
                if (opponent.points == 40) {
                    // handle deuce
                } else {
                    // handle win
                }
            }
        }
    }

    override fun getScore(player: Player, opponent: Player): String {
        TODO("Not yet implemented")
    }

}