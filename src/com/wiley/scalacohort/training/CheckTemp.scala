package com.wiley.scalacohort.training

import com.wiley.scalacohort.training.CheckTemp.{x, y}

object CheckTemp extends App {

  val x =scala.io.StdIn.readInt()
  val y =scala.io.StdIn.readInt()

  if(x<0 && y > 100){
    println(x + " is below 0 and " +  y + " is above 100")
  }
  else if(x<0 && y < 100){
    println(x + " is below 0 and " +  y + " is below 100")
  }
  else if (x > 0 && y > 100) {
    println(x + " is above 0 and " + y + " is above 100")
  }
  else {
    println(x + " is above 0 and " + y + " is below 100")
  }


}
