package com.wiley.scalaExceptions

class ExceptionsPart2 {

  def divide(a:Int, b:Int): Unit ={
    try{
      a/b
      var arr = Array(1, 2)
      arr(10)
    }
    catch{
      case e:ArithmeticException => println(e)
      case ex:Throwable => println("found unknown " + ex)
    }
    println("rest of code")
  }

}

object MainExceptionTest extends App{
  new ExceptionsPart2().divide(100, 10)

}
