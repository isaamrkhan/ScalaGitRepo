package com.wiley.collections

import scala.collection.immutable.ListSet

//try to avoid using te same object name as a collection that exists
object ListSets extends App {

  //maintains order of the set, doesn't sort it
  var listSet = ListSet(4, 5, 2, 6, 8, 3, 2)
  listSet.foreach((elem:Int) => println(elem))

  //checks if listset is empty
  println(listSet.isEmpty)

  //empties listset
  listSet = ListSet.empty
  println(listSet.isEmpty)


}
