package com.wiley.training.learning.practice.examples

import org.scalatest.funsuite.AnyFunSuite
import com.wiley.logTest.Test1

class Test1x extends AnyFunSuite{
  var t = new Test1
  test("simple addition"){
    assert(t.addition(2, 4) === 6)
  }
  test("negative addition"){
    assert(t.addition(-2, 4) === 2)
  }

}
