package com.wiley.accessModifiers

class AccessExample{
  private var a:Int = 10
  def show(): Unit ={
    println(a)
  }
}

object AccessTest1 extends App {
  var p = new AccessExample
  //p.a = 12

}
