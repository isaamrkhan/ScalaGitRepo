package com.wiley.functions

object recursionPractice {
  def main(args: Array[String]): Unit ={
    var result = functionExample(5)
    println(result)

  }

  def functionExample(a:Int): Int ={
    if (a == 1){
      return 1
    }
    else{
      a*functionExample(a-1)
    }
  }

}
