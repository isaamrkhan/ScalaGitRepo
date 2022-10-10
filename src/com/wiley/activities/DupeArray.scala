package com.wiley.activities

import scala.util.control.Breaks.{break, breakable}


object DupeArray extends App {

  var arr = Array(1, 2, 3, 3, 4, 5, 6, 6, 7, 7)
  var count = 0

  for(i <- 0 to arr.length-1){
    breakable {
      if (i < arr.length - 1 && arr(i) == arr(i + 1)) {
        break
      }
      else {
        arr(count) = arr(i)
        count += 1
      }
    }
  }
  println("Array size is: " + count)

  for(x <- 0 to count-1){
    println(arr(x))
  }

}
