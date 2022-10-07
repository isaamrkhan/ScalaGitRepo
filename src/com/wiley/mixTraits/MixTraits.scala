package com.wiley.mixTraits

trait Print{
  def print()
}

abstract class PrintA4{
  def printA4()
}

class A6 extends PrintA4 with Print{
  override def print(): Unit ={
    println("print Sheet")
  }

  override def printA4(): Unit = {
    println("A4 sheet")
  }
}

object MixTraits extends App {
  var a = new A6
  a.printA4()
  a.print()

}
