package com.wiley.multiDimentional

class ArrayExample{
  var arr1 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
  var arr2 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10))
  var arrAns = Array.ofDim[Int](2, 5)

  def addAndShow: Unit ={
    for (i <- 0 to 1){
      for(j <- 0 to 4){
        arrAns(i)(j) = arr1(i)(j) + arr2(i)(j)
        print(" " + arrAns(i)(j))
      }
      println()
    }
  }
}

object AdditionMultDimention extends App {
  var a = new ArrayExample
  a.addAndShow

}
