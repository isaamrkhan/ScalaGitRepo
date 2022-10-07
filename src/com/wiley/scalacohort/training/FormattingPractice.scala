package com.wiley.scalacohort.training

object FormattingPractice extends App {


  println("What is your name?")
  var name = scala.io.StdIn.readLine()
  println("What is your age?")
  var age = scala.io.StdIn.readInt()

  println("Name: " + name)
  println("Age: " + age)

}
