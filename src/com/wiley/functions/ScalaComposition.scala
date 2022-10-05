package com.wiley.functions

object ScalaComposition {

  def main(args: Array[String]): Unit = {
    val result:Double = multiplyBy4(subtract(divideBy2(add(2))))
    println(result)
  }

  def add(a:Int): Int ={
    a+6
  }

  def multiplyBy4(a:Int): Int ={
    a*4
  }

  def divideBy2(a:Int): Int ={
    a/2
  }

  def subtract(a:Int): Int = {
    a-2
  }

}
