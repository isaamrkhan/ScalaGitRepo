package com.wiley.tuples

object TuplePractice extends App {



  var tuple = (1, 4, 5, 6, 9, 4)
  var tuple2 = ("Apple", "Orange" ,"Banana")
  var tuple3 = (2.3, 2.4, 2.5, 2.6, 2.7)
  var tuple4 = (1, 2, 4, 5, 66, "India", 2.54)

  tuple.productIterator.foreach(i => println(i))



  println(tuple)
  println(tuple2)
  println(tuple3)
  println(tuple4)


}
