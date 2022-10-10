package com.wiley.strings

class StringExample {
  var s1 = "Scala string example"
  var s2 = "Hello Scala"
  var s3 = "Hello Scala"

  def show: Unit ={
    println(s1.equals(s2))
    println(s2.equals(s3))
  }

}

object tempString extends App{
  new StringExample().show
}
