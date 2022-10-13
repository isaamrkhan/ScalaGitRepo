package com.wiley.collections

object ScalaSeqTest extends App {

  var seq:Seq[Int] = Seq(52, 8, 9, 1, 8, 3, 7, 1)
  seq.foreach((elem:Int) => println(elem))

  println(seq(2))

  println(seq.isEmpty)
  println(seq.endsWith(Seq(8, 3, 7, 1)))
  println(seq.contains(8))
  //lastIndexOf gives the index of the last occurrence of the parameter
  println(seq.lastIndexOf(1))
  println(seq.reverse)

}
