package com.wiley.collections

import scala.collection.immutable.HashMap

object IterateOverMaps extends App {

  var hashMap = HashMap("A" -> "Apple", "B" -> "Banana", "C" -> "Carrot")
  hashMap.foreach{
    case(key, value) => println(key + "-->" + value)
  }

  println(hashMap("B"))
  
  hashMap = hashMap+("D" -> "Doll")
  hashMap.foreach {
    case (key, value) => println(key + "-->" + value)
  }

}
