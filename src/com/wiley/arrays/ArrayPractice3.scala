package com.wiley.arrays
import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks.break

object ArrayPractice3 extends App {

  var arr = ArrayBuffer(2, 8, 19, 20, 25, 50, 100, 10)

  for(i <- arr){
    if(i % 2 != 0){
      arr -= i
      break
    }
  }
  println(arr)

}
