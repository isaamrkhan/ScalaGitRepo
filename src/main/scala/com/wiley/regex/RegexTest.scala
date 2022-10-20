package com.wiley.regex

object RegexTest extends App {

  val str = "Hello World!".r
  val source = "Hello World! my name is Isaam Hello World!"
  println(str.findFirstIn(source))
  str.findAllMatchIn(source).foreach(i => println(i))

  val needChange = "replaceTest"
  val finalStr = "replaceTest".replaceAll(".Test", "**")
  println(needChange)
  println(finalStr)

  val strCheck = "check"
  //anything that ends with "k"
  val finalTempStr = strCheck.matches(".*k")
  println(finalTempStr)

  val splitString = "test sentestnce stto check result"
  val finalSString = splitString.split("st", 4)

  for(sq <- finalSString){
    println(s"here is the array ${sq}")
  }

}
