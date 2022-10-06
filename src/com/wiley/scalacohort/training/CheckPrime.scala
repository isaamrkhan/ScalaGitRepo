package com.wiley.scalacohort.training

import scala.util.control.Breaks.break

object CheckPrime extends App {

  val x = scala.io.StdIn.readInt()
  var ans = true

  if (x > 2) {

    for (i <- 2 to (x - 1)) {
      if (x % i == 0) {
        ans = false
      }
    }

    if (ans == true) {
      println("prime number")
    }
    else {
      println("not prime number")
    }

  }
}
