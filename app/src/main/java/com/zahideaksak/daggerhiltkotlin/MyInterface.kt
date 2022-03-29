package com.zahideaksak.daggerhiltkotlin

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction(): String
}

@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule {
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor: InterfaceImplementor): MyInterface
}


/*@InstallIn(ApplicationComponentManager)
@Module
class MyModule {

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface {
        return InterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson {
        return Gson()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction() : MyInterface {
        return SecondInterfaceImplementor()
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor*/
