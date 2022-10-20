package com.wiley.collections

import scala.collection.immutable.Queue

class TestQueue {
  var queue = Queue(1, 5, 3, 2, 4, 6, 9, 7, 8)
  var queue2: Queue[Int] = Queue(22, 33, 11, 55, 44, 78, 96)

  def returnFirstElement(queue: Queue[Int]): Int ={
    val firstElement = queue.front
    firstElement
  }

}
