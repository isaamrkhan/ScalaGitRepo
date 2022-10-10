package com.wiley.multiDimentional

class MultiArrayClass{

  //parameters represent rows and columns
  var arr = Array.ofDim[Int](4, 5)
  //arr(row)(column)
  arr(0)(1) = 1
  arr(0)(3) = 1
  arr(2)(0) = 1
  arr(2)(4) = 1
  arr(3)(1) = 1
  arr(3)(2) = 1
  arr(3)(3) = 1

  //multiple ways of making 2d arrays
  var arr2 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))


  def show: Unit = {
    for (i <- 0 to 3) {
      for (j <- 0 to 4) {
        print(" " + arr(i)(j))
      }
      println("")
    }
    println("third element is " + arr(1)(1))
  }

  def show2: Unit ={
    for(i <- 0 to 1){
      for(j <- 0 to 4){
        print(" " + arr2(i)(j))
      }
      println("")
    }
    println("third element is " + arr2(1)(1))
  }
}

object MultiArrayExample extends App {
  var a = new MultiArrayClass
  a.show
  a.show2
}
