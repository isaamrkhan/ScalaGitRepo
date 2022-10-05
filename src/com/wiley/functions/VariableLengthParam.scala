package com.wiley.functions

object VariableLengthParam extends App {

  def add(x:Int*): Int ={
    var sum = 0
    for(a <- x){
      if(a%2 == 0){
        sum += a
      }
    }
    sum
  }

  var sum = add(1, 2, 3, 4, 5, 6, 7, 8, 9)
  println(sum)

  var tuple = List((2, 4), (2, 3), (3, 4))
  print((tuple.map(_._1).sum, tuple.map(_._2).sum))

}
