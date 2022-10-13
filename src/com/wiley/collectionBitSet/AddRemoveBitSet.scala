package com.wiley.collectionBitSet

import scala.collection.immutable.BitSet

object AddRemoveBitSet extends App {
  var numbers = BitSet(2, 4, 6, 8, 10)
  numbers.foreach((elem:Int) => println(elem))
  //adds element to end of set
  numbers += 20
  numbers.foreach((elem:Int) => println(elem))
  //removes the element from the set, not index
  numbers -= 2
  numbers.foreach((elem:Int) => println(elem))



}
