package com.wiley.methodOverflowing

object LazyEvaluation extends App {

  //does not run the function while initializing
  //lazy variables will only be called when invoked
  lazy val x = test

  print(x)
  
  def test(): Unit ={
    println("Isaam")
  }

}
