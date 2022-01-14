package com.example.kotlinbasics

fun main(){
    var testClass = myClass(param1 = "ABC", param2 ="DEF")

    println(testClass.arg1)
    // ABC
    testClass.whatAreArgs()
    // there are argements here: ABC & DEF
}


class myClass(param1: String, param2: String){
    // property
    var arg1: String = param1
    var arg2: String = param2

    // method
    fun whatAreArgs(){
        println("there are argements here: $arg1 & $arg2")
    }
}

class MobilePhone(osName: String, brand: String, model: String){

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    var battery : Int = 30
    fun chargeBattery("Charge")




}