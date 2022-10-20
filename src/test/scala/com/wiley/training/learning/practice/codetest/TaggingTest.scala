package com.wiley.training.learning.practice.codetest

import org.scalatest.tagobjects.Slow
import org.scalatest.flatspec.AnyFlatSpec


class TaggingTest extends AnyFlatSpec{

  "The Scala language" must "add syntax correctly" taggedAs(Slow) in{
    val sum = 1 + 1
    assert(sum === 2)
  }
  it must "subtract correctly" taggedAs(Slow) in{
    val diff = 4-1
    assert(diff === 3)
  }

}
