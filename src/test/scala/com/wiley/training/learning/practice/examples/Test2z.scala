package com.wiley.training.learning.practice.examples

import org.scalatest.wordspec.AnyWordSpec
import com.wiley.logTest.Test2


class Test2z extends AnyWordSpec{
  var t = new Test2

  "2 numbers" when{
    "divided" should{
      "give the quotient" in{
        assert(t.division(4, 2) === 2)
      }
    }
  }
  "should throw an ArithmeticException when divided by 0" in{
    assertThrows[ArithmeticException]{
      t.division(4, 0)
    }
  }

}
