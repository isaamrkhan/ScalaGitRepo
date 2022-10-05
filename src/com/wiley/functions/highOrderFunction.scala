package com.wiley.functions

object highOrderFunction {
  def main(args: Array[String]): Unit ={

    functionExample(25, add3)

  }

  def functionExample(a:Int, b:Int => AnyVal): Unit ={

    println(b(a))

  }

  def add3(a:Int): Int ={
    a+3
  }

}
