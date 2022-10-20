package com.wiley.training.learning.practice.codetest

import org.scalatest.freespec.AnyFreeSpec

class SetFreeSpecTest extends AnyFreeSpec{

  "A Set" -{
    "When empty" -{
      "should have size 0-" -{
        assert(Set.empty.size === 0)
      }
    }
  }

  "should produce NoSuchElementException when head is invoked in" -{
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }

}
