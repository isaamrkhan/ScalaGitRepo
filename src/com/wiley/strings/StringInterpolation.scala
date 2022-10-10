package com.wiley.strings

class StringExample2{
  var s1 = "Scala String Example"
  var version = 2.12

  def show: Unit ={
    println(f"this is $s1%s scala version is $version%2.2f")
  }
}

object StringInterpolation extends App {
  new StringExample2().show

}
