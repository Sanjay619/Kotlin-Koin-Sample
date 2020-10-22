package com.its.kotlin_koin_sample

import androidx.lifecycle.ViewModel

class Student(val course: SchoolCourse, val friend: Friend) {


    fun beSmart() {
        course.Study()
        friend.hangout()
    }
}

class SchoolCourse() {
    fun Study() {
        println("I am Studying...!")

    }
}

class Friend() {
    fun hangout() {
        print("we're hanging out")
    }
}

class MainViewModel (val course: SchoolCourse, val friend: Friend): ViewModel(){
    fun performActtion(){

    }
}