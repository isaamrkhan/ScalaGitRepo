package com.wiley.training.learning.practice.codetest


import com.wiley.collections.ScalaCollection
import org.scalatest.funsuite.AnyFunSuite

import scala.collection.mutable

class ExampleSuite extends AnyFunSuite{

  test("pop is invoked on non empty stack"){

    assert(ScalaCollection.result === 2)
    assert(ScalaCollection.stack.size === ScalaCollection.oldSize - 1)
  }

  test("pop is invoked on an empty stack"){
    val emptyStack = new mutable.Stack[Int]

    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)

  }

  test("testing index out of bounds"){
    val s = "hi"
    intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }

  test("Testing IndexOutOfBounds Message"){
    val s = "Hi"
    val thrown = intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }

}
