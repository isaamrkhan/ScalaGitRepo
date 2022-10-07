package com.wiley.abstractClass

//abstract classes hide internal details and only shows functionality
abstract class Bike{
  def run()
}

class BMW extends Bike{
  override def run(): Unit = {
    println("running fine")
  }
}

object AbstractClass extends App {
  var b = new BMW
  b.run()

}
