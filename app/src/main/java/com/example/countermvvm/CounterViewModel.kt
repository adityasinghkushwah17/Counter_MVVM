package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val repository :CounterRepo= CounterRepo()
    private val _count = mutableIntStateOf(repository.getCounter().count)

    // Exposing the _count value as an immutable State
    val count: MutableState<Int> = _count

    fun increment() {
       repository.incrementC()
        _count.value=repository.getCounter().count
    }

    fun decrement() {
        repository.decrementC()
        _count.value=repository.getCounter().count
    }

    fun reset() {
        repository.reset()
        _count.value=repository.getCounter().count
    }
}
