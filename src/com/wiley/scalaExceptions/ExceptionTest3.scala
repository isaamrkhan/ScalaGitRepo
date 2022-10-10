package com.wiley.scalaExceptions

class ExceptionTest3 {

  def divide(a:Int, b:Int): Unit ={
    try{
      a/b
      var arr = Array(1, 2)
      arr(10)
    }
    catch {
      case e:ArithmeticException => println(e)
      case exp:Exception => println(exp)
      case th:Throwable => println(th)
    }
    finally{
      println("Finally will always get excecuted")
    }
    println("done")
  }
}

object TestObject3 extends App{
  new ExceptionTest3().divide(100, 1)
}
