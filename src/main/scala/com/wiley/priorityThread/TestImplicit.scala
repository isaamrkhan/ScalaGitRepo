package com.wiley.priorityThread

object TestImplicit extends App {

  val value = 10
  implicit val multiplier = 3

  def multiply(implicit by:Int) = value * by

  val result = multiply
  println(result)

}
