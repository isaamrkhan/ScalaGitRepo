package com.wiley.scalaExceptions

class ExceptionExample {

  def divider(a:Int, b:Int): Unit ={
    a/b
    println("rest of code is executed")
  }

}

object tempCheckException extends App{
  new ExceptionExample().divider(200, 1)
}
