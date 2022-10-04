package com.wiley.patternMatching

object MatchNumbers extends App {

  var a = 3
  a match {
    case 3 => println("Three")
    case 4 => println("Four")
    case 5 => println("Five")
  }

}
