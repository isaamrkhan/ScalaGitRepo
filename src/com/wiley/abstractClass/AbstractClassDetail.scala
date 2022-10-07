package com.wiley.abstractClass

abstract class Bike1(a:Int){
  var b:Int = 20
  var c:Int = 25
  def run()
  def performance(): Unit ={
    println("good performance")
  }
}

class Tesla(a:Int) extends Bike1(a) {
  c = 30
  override def run(): Unit ={
    println("testing")
    println(a)
    println(b)
    println(c)
  }
}

object AbstractClassDetail extends App {
  var h = new Tesla(10)
  h.run()
  h.performance()

}
