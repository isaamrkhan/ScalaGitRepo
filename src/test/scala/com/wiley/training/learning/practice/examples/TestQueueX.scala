package com.wiley.training.learning.practice.examples

import com.wiley.collections.TestQueue
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.immutable.Queue

class TestQueueX extends AnyFunSuite {

  test("check the front element opf the queue"){
    val q = new TestQueue
    val initQueue = Queue(2, 3, 4, 5, 6, 7, 8, 9)
    assert(q.returnFirstElement(initQueue) === 2)
  }

}
