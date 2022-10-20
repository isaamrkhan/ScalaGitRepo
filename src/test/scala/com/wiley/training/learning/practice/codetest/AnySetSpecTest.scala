package com.wiley.training.learning.practice.codetest

import org.scalatest.funspec.AnyFunSpec

class AnySetSpecTest extends AnyFunSpec{
  describe("a set"){
    describe("when empty"){
      it("should have size 0"){
        assert(Set.empty.size === 0)
      }
    }
  }

  it ("Should produce NoSuchElementException when head is invoked and "){
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }
}
