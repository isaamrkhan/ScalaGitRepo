package com.wiley.streamScala

import scala.collection.immutable.Stream.cons

object AnotherStream extends App {

  val stream2:Stream[Int] = cons(1, cons(10, cons(100, Stream.empty)))
  println(stream2)

  stream2.foreach((element:Int) =>{
    println(element)
  })

}
