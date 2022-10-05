package com.wiley.functions

object ScalaCurryingFunction extends App{

  val result = mult(5)(3)
  println(result)
  val temp = mult(3)_
  val result2 = temp(2)
  println(result2)

  //multiple ways of defining parameters to allow for different features
  def mult(a:Int)(b:Int): Int ={
    a * b
  }

}
