package com.wiley.streamScala

object StreamTest extends App {

  //need to specify where the stream ends, using Stream.empty
  val stream = 1 #:: 2 #:: 8 #:: 7 #::  Stream.empty
  println(stream)

  println("Take the first 2 elements from the stream")
  stream.take(2).print()
  println()
  stream.take(10).print()
  println()

  println(stream.map(_+1))
}
