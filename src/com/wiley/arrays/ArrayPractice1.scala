package com.wiley.arrays

class ArrayPractice1 {

  var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)
  var arr2 = new Array[String](30)
  var arr3:Array[String] = new Array[String](30)

  
  def show(): Unit ={
    for(a <- arr){
      println(a)
    }

    print("third element: " + arr(2))

  }

}

object MainPrac extends App{
  var prc = new ArrayPractice1
  prc.show()
}
