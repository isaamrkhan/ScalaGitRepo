package com.wiley.functions

object AnonymousFunction extends App {

  //function written as variable
  var result1 = (a:Int, b:Int) => a + b
  println(result1(10, 10))

  //_ is used as an empty variable
  var result2 = (_:Double)+ (_:Int)
  println(result2(20.25 , 15))

  var result3 = (_:String) + (_:String)
  println(result3("Hello ", "World!"))

}
