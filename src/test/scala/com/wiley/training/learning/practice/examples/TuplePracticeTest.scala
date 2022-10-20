package com.wiley.training.learning.practice.examples

import org.scalatest.funsuite.AnyFunSuite
import com.wiley.tuples.TuplePractice

class TuplePracticeTest extends AnyFunSuite{

  var tuple = (1, 4, 5, 6, 9, 4)

  test("Tuple 1 Contains"){
    assert(tuple._1 === 1)
  }

}
