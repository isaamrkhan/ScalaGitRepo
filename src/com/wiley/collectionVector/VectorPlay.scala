package com.wiley.collectionVector

object VectorPlay extends App {

  var vector:Vector[Int] = Vector(5, 2, 6, 7, 9, 1, 4, 7)
  var vector2 = Vector(2.4, 7, 1, 7)
  var vector3:Vector[String] = Vector.empty

  println(vector)
  println(vector2)
  println(vector3)

  //append an element
  vector3 = vector3 :+ "racing"
  println(vector3)

  var vectorMerge = vector2 ++ vector3
  println(vectorMerge)
  println(vectorMerge.reverse)
  var vector4 = vector.sorted
  println(vector4)

  val oneToFive = 1 to 5
  println(oneToFive)

}
