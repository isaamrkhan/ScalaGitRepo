package com.wiley.scalacohort.training

object String2dArrays extends App {

  var arr = Array(Array("Hello ", "Name: ", "Age: "), Array("test1 ", "test2 ", "test3 "))
  var arr2 = Array(Array("World |", "Isaam |", "21"), Array("test4 |", "test5 |", "test6"))
  var arr3 = Array.ofDim[String](2, 3)

    for (i <- 0 to 1) {
      for (j <- 0 to 2) {
        arr3(i)(j) = arr(i)(j).concat(arr2(i)(j))
        print(" " + arr3(i)(j))
      }
      println()
    }

  var x = arr3(0)(0).substring(6, 11)
  var y = "world"
  println(x)
  if (x.compareTo(y) == 0){
    println("good work")
  }
  else {
    println("unlucky")
  }

}
