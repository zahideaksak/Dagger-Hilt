package com.zahideaksak.daggerhiltkotlin

import javax.inject.Inject

class ClassExample @Inject constructor(private val myInterfaceImplementor: MyInterface) {

    fun myFunction(): String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }
}