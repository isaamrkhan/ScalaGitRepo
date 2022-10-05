package com.wiley.operators

object OperatorsPractice extends App{

  //operands/instance variables
  var a = 40
  var b = 10
  var c = true
  var d = false
  var result = 0
  var e = 4
  var f = 2

  //Arithmetic Operator
  println("Addition is + : " + (a + b))
  println("Subtraction is - : " + (a - b))

  //Relation Operator
  if(a == b){
    println("same")
  }
  else{
    println("different")
  }

  //Logical Operator
  println("Logical or is ||: " + (c || d))

  //Bitwise AND Operator
  result = e&f
  println("Bitwise AND " + result)

  //Assignment Operator
  println("Addition Assignment is " + (a += b))

  //&& only works on boolean
  if(true && false){
    println("yes")
  }
}
