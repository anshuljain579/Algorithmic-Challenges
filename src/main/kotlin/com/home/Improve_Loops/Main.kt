package com.home.Improve_Loops

val fruits = listOf("Apple", "Banana", "Cherry", "Orange")
fun main() {
    println("Normal for loop")
    for(index in 0..fruits.size -1 ) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }

    println("=============")
    println("Using until")
    for(index in 0 until fruits.size) {
        val fruit = fruits[index]
        println("$index :  $fruit")
    }

    println("=============")
    println("Using lastIndex")
    for(index in 0..fruits.lastIndex) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }


    println("=============")
    println("Using Indices")
    for(index in fruits.indices) {
        val fruit = fruits[index]
        println("$index : $fruit")
    }

    println("=============")
    println("Loop using withIndex")
    for((index, fruit) in fruits.withIndex()) {
        println("$index : $fruit")
    }

    println("=============")
    println("Using ForEachIndex")
    fruits.forEachIndexed {
        index , fruit  -> println("$index : $fruit")
    }
}