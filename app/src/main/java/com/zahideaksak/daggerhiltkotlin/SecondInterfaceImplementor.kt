package com.zahideaksak.daggerhiltkotlin

import javax.inject.Inject

class SecondInterfaceImplementor @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Second Interface Implementor"
    }

}