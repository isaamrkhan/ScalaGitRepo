package com.wiley.pattern

class CompanionClass{
  def hello(): Unit ={
    println("Hello World!")
  }
}

object CompantionObject extends App {
  new CompanionClass().hello()
  println("companion")

}
