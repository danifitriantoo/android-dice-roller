package com.example.diceroller

class Dice(val numSides: Int) {
    fun Roll(): Int {
        return (1..numSides).random()
    }
}