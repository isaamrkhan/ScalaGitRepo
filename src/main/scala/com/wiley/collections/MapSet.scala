package com.wiley.collections

class MapSetTester{
/*  def addToMap(): Map[Int, String] = {
    var map3 = Map.empty[Int, String]
    map3 = map3 + (1, "A")
    return map3

  }*/
}

object MapSet extends App {

  var map = Map(("A", "Apple"), ("B", "Banana"))
  var map2 = Map("A" -> "Apple", "B" -> "Banana")
  var emptyMap:Map[String, String] = Map.empty[String, String]

  println(map)
  println(map2)
  println(emptyMap)

  //maps have keys assigned so u can call the value equal to that key
  println(map("B"))

  //you can add or remove keys and values from the map
  map2 = map2 + ("D" -> "Dog")
  println(map2)

  map2 = map2 - ("B")
  println(map2)




}
