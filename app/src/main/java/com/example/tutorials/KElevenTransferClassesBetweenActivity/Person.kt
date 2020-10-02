package com.example.tutorials.KElevenTransferClassesBetweenActivity

import java.io.Serializable


// it says to android that this class that hold the data
data class Person(
    val name: String,
    val age: Int,
    val country: String
// if you want to able to send this class
// between activities
// so to pass this class to an intent object
// we need to mark this class
// as serializable
// so that is just to tell kotlin that we want to be able to
// pass this class to an object that can be transferred between activities
// and can be passed to an intent
) : Serializable
// serializable is not a class in here that is an interface