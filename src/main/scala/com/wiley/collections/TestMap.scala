package com.wiley.collections

object TestMap extends App {

  val s1 = Set(5, 1, 3, 5, 6, 9)
  val result = s1.map(x => x * x)
  println(result)

  val s2 = Set("hello", "world", "Isaam", "Khan")
  val result2 = s2.map(_.toUpperCase())
  println(result2)

  val s3 = List("hello", "world", "Isaam", "Khan")
  val result3 = s3.flatMap(_.toUpperCase())
  println(result3)

}
