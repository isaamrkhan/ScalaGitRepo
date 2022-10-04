package com.wiley.scalacohort.training

object WhileLoops extends App {
  var a = 10
  while(a<=20){
    println(a)
    a += 1
  }

  var b = 10
  do{
    println(b)
    b += 1
  }while(b<=20)
}
