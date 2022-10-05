package com.wiley.functions

object defaultValFunction {
  def main(args: Array[String]): Unit ={
    val result = FunctionExample(14, 23)
    val result2 = FunctionExample()
    //if you want to assign the second parameter, this is one way to do it
    val result3 = FunctionExample(b = 45)
    println(result + "\n" + result2 + "\n" + result3)
  }

  //example of parameter with default value
  def FunctionExample(a:Int = 0, b:Int = 0): Int ={
    a + b
  }

}
