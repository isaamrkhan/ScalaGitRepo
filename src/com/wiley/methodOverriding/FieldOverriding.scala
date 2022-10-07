package com.wiley.methodOverriding

class Vehicle1{
  val speed:Int = 60
}

class Bike1 extends Vehicle1{
  override val speed:Int = 100
  def show(): Unit ={
    println(speed)
  }
}

object FieldOverriding extends App {
  var b = new Bike1
  b.show()

}
