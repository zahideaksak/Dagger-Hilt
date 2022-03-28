package com.zahideaksak.daggerhiltkotlin

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }
}