package com.its.kotlin_koin_sample


import org.koin.core.definition.Kind
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    //Defines a Singleton of SchoolCourse
    single { SchoolCourse() }

    // Define a factory create new instance every time
    factory { Friend() }

    // Define a factory create new instance every time
    factory { Student(get() , get()) }
}