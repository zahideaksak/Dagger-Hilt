package com.zahideaksak.daggerhiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample
@Inject
constructor(
    private val myInterfaceImplementor: MyInterface,
    private val mySecondInterfaceImplementor: MyInterface
) {
    fun myFunction(): String {
        return "Working: ${myInterfaceImplementor.myPrintFunction()}"
    }
    fun secondFunction() : String {
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}