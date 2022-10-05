package com.wiley.functions

object FunctionCall {

  // Unit = no return/void
  def main(args: Array[String]): Unit ={
    var result = functionExam2()
    println(result)
    functionExample(10, 20)
  }

  def functionExam(): Unit ={
    println("simple function")
  }

  //after function, include type afterwards to return
  def functionExam2(): Any = {
    var a = 10
    return a
  }

  //Example of function with parameters
  def functionExample(a:Int, b:Int): Unit ={
    var c = a + b
    println(c)
  }



}
