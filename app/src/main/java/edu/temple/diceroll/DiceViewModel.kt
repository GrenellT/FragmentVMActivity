package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    private val diceRoll = MutableLiveData<Int>()

    fun setDiceRoll(roll: Int) {
        diceRoll.value = roll
    }

    fun getDiceRoll() : LiveData<Int> {
        return diceRoll
    }
}