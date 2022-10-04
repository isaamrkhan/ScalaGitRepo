package com.wiley.patternMatching

object MixTypes {
def main(args:Array[String]): Unit ={
  var result = search(2)
}

  def search(a:Any):Any=a match{
    case 1 => println("One")
    case "two" => println(2)
    case "three" => println("Three")
    case 3.14 => println("pi")
    case _ => println("None")
  }

}
