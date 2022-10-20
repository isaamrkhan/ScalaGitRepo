package com.wiley.training.learning.practice.examples

import org.scalatest.funspec.AnyFunSpec
import com.wiley.logTest.Test1


class Test1y extends AnyFunSpec{
  var t = new Test1

  describe("when 2 number are added"){
    it("should make the sum of both numnbers"){
      assert(t.addition(2, 4) === 6)
    }
  }


}
