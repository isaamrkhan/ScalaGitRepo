package com.wiley.training.learning.practice.codetest

import com.wiley.logTest.CubeCalculator
import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) == 27)
  }
}
