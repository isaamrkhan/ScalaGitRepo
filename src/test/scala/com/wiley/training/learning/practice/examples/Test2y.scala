package com.wiley.training.learning.practice.examples

import org.scalatest.funspec.AnyFunSpec
import com.wiley.logTest.Test2


class Test2y extends AnyFunSpec{

  var t = new Test2

  describe("when 2 number are divided") {
    it("should give the quotient") {
      assert(t.division(4, 2) === 2)
    }
  }

  it("should throw an ArithmeticException when divided by 0"){
    assertThrows[ArithmeticException]{
      t.division(2, 0)
    }
  }

}
