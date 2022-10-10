package com.wiley.strings

class StringComparison {

  var s1 = "Scala String Example"
  var s2 = "Hello Scala"
  var s3 = " Hello Scala"
  var s4 = " Scala"
  //more efficient way to concatenate vs +
  var s5 = s3.concat(s4)

  def show: Unit ={
    println(s1.compareTo(s2))
    println(s2.compareTo(s3))
    println(s5)
    //substring prints only the characters that you want
    println(s1.substring(0, 10))
  }

}

object CompareString extends App{
  new StringComparison().show
}
