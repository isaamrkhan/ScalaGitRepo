package com.wiley.scalacohort.training

object ReverseDigit extends App {

  var digits:String = "123456"

  val ans = (for(i <- digits.length-1 to 0 by -1)yield digits(i)).mkString
  print(ans)
}
