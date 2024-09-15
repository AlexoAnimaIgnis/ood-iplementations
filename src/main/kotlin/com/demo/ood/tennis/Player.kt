package com.demo.ood.tennis

class Player(val name: String) {
    var points: Int = 0
    var gamesWon: Int = 0
    var setsWon: Int = 0

    fun resetPoints() {
        points = 0
    }
}
