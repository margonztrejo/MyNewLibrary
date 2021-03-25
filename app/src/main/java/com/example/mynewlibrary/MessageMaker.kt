package com.example.mynewlibrary

class MessageMaker(private val name: String) {
    fun getMessage(): String{
        return "Hola $name, te escribo desde mi librería Android"
    }
}