package com.wiley.arrays

class ArrayExample2{
  var arr = new Array[Int](5)
  def show(): Unit ={
    for(a <- arr){
      println(a)
    }
    println(arr(2))
    arr(2) = 10
    println(arr(2))

  }
}

object ArrayPractice2 extends App {
  var a = new ArrayExample2
  a.show()

}
