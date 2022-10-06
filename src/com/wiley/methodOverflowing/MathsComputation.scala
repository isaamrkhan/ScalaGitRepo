package com.wiley.methodOverflowing

class MathsComputation {

  def add(a:Int, b:Int): Unit ={
    var sum = a + b
    println(sum)
  }

  def add(a:Int, b:Int, c:Int): Unit ={
    var sum = a + b + c
    println(sum)
  }

}

object MainTemp extends App{
  var a = new MathsComputation
  a.add(5, 2)
  a.add(5, 2, 6)
}