package com.wiley.anonymous

class Arithmetic {

  def add(a:Int, b:Int): Unit ={

    var add = a + b
    println("sum = " + add)

  }

  def multiple(a:Int, b:Int): Unit ={
    var multiple = a * b
    println("product = " + multiple)
  }

}

object MainObject2 extends App{
  new Arithmetic().add(2, 10)
  new Arithmetic().multiple(10, 10)
}