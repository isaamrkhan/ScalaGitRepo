package com.wiley.regex

import scala.util.matching.Regex

object NumberInDigits extends App {

  // lower case d represents digits
  val reg = new Regex("\\d")
  val str = "to check number 520 in a string"
  println(reg.findAllIn(str).mkString(", "))

  // capital D represents all non-digits
  val reg2 = new Regex("\\D")
  val str2 = "to check number 520 in a string"
  println(reg2.findAllIn(str2).mkString(", "))

  // capital S is for all characters ignoring spaces
  val reg3 = new Regex("\\S")
  val str3 = "to check number 520 in a string"
  println(reg3.findAllIn(str3).mkString(", "))

  // lower case s is for all the spaces
  val reg4 = new Regex("\\s")
  val str4 = "to check number 520 in a string"
  println(reg4.findAllIn(str4).mkString(", "))

  // looks for the characters "q" or "r"
  val reg5 = new Regex("q|r")
  val str5 = "Check regular expression"
  println(reg5.findAllIn(str5).mkString(", "))

  // "." checks for everything
  val reg6 = new Regex(".")
  val str6 = "check for a new line"
  println(reg6.findAllIn(str6).mkString(", "))

}
