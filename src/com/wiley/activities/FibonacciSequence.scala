package com.wiley.activities

object FibonacciSequence extends App {

  def fib(num:Int): Int ={
    if(num <= 1){
      return num
    }
    return (fib(num - 1) + fib(num - 2))
  }

  println(fib(2))

}
