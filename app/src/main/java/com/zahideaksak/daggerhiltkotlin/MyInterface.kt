package com.zahideaksak.daggerhiltkotlin

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction(): String
}

//@InstallIn(ActivityComponent::class)
//@Module
//abstract class MyModule {
//    @ActivityScoped
//    @Binds
//    abstract fun bindingFunction(myImplementor: InterfaceImplementor): MyInterface
//}

//@InstallIn(ApplicationComponent::class)
//@Module
//abstract class MyModule {
//    @Singleton
//    @Provides
//    fun providerFunction() : MyInterface {
//        return InterfaceImplementor()
//    }
//}