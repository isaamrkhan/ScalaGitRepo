package com.wiley.scalacohort.training

object MultiLineExpression extends App {

  println(add1(10, 20))
  
  def add1(i1:Int, i2:Int): Int ={
    i1+
    i2
  }

}
