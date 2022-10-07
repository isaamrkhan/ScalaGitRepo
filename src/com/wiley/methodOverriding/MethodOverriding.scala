package com.wiley.methodOverriding

object MethodOveriding extends App {
  var b = new Bike()
  b.run

}

class Car{
  def run: Unit ={
    println("Car is running")

  }
}

class Vehicle extends Car{
  override def run: Unit ={
    //println("Vehicle is running")
    super.run
  }
}

//override allows the same function name to do certain things
class Bike extends Vehicle{
  override def run: Unit ={
    //println("Bike is running")\
    super.run
  }
}
