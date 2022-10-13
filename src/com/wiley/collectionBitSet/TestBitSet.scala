package com.wiley.collectionBitSet

import scala.collection.immutable.BitSet

object TestBitSet extends App {

  var nums = BitSet(81, 2, 3, 54, 745, 234, 4362, 5, 21)
  nums.foreach((element:Int) => println(element))

}
