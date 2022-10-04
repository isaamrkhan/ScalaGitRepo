package com.wiley.scalacohort.training

object BasicList extends App {

  var list = List(1, 2, 3, 4, 5, 6, 7, 8)
  BasicList.list.foreach{
    println
  }

  list.foreach(println)

  list.foreach((x:Int) => print(x + " "))

}
