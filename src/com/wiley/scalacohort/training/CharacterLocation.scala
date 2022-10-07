package com.wiley.scalacohort.training

object CharacterLocation extends App {

  var x = "Hello World!"

  for(a <- 0 to x.length){
    if(a == 7){
      println("the 8th letter is: " + x(a))
    }
  }

}
