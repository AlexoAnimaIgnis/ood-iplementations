package com.demo.ood.tennis


interface GameState {
    fun addPoint(player: Player, opponent: Player, game: Game)
    fun getScore(player: Player, opponent: Player): String
}
