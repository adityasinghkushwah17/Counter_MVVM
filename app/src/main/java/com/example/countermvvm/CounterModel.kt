package com.example.countermvvm

data class CounterModel(var count:Int) {

}

class CounterRepo{
    private var _counter=CounterModel(0)
    fun getCounter() = _counter

    fun incrementC() {
        _counter.count++
    }

    fun decrementC() {
        _counter.count--
    }

    fun reset() {
        _counter.count = 0
    }

}