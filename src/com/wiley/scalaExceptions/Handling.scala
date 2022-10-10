package com.wiley.scalaExceptions

class ExceptionExample2 {

  def divider(a:Int, b:Int): Unit ={
    try{
      a/b
    }
    catch{
      case e:ArithmeticException => println(e)
    }
    println("rest of the code")
  }
}

object Handling extends App {
  new ExceptionExample2().divider(200, 0)
}
