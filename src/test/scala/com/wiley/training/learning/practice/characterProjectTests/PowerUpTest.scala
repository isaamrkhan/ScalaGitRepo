package com.wiley.training.learning.practice.characterProjectTests

import org.scalatest.funsuite.AnyFunSuite
import com.wiley.characterProject.{Hero, PowerUp}

class PowerUpTest extends AnyFunSuite{

  var t = new Hero

  test("simple addition") {
    assert(t.Stats(25) === 25)
  }

}
