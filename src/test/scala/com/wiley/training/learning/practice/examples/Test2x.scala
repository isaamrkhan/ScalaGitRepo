package com.wiley.training.learning.practice.examples

import com.wiley.logTest.Test2
import org.scalatest.funsuite.AnyFunSuite

class Test2x extends AnyFunSuite{

  var t = new Test2
  test("simple division") {
    assert(t.division(4, 2) === 2)
  }
  test("negative division") {
    assert(t.division(-4, 2) === -2)
  }

}
