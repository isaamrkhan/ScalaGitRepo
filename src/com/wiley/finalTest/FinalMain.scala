package com.wiley.finalTest

class Vehicle{
  //final cannot be changed, not even override
  //var is mutable
  //val is immutable but can be overridden
  //final cannot change at all

  final val speed:Int = 60

   def printing(): Unit ={
    println("test")
  }

}

class Bike extends Vehicle{
  //override val speed:Int = 100
  override def printing(): Unit ={
    println("test2")
  }

}

object FinalMain {

}
