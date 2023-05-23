package com.example.simplecalculator

import com.example.simplecalculator.CalculatorOperation.Add.symbol

sealed class CalculatorOperation(val symbol:String){
    object Add:CalculatorOperation("+")
    object Subtract:CalculatorOperation("-")
    object Multiply:CalculatorOperation("x")
    object Divide:CalculatorOperation("/")
    object Percent:CalculatorOperation("%")
}
