package com.wiley.training.learning.practice.codetest

import org.scalatest.refspec.RefSpec

class RefSpecTest extends RefSpec {

  object `A Set`{
    object `when empty`{
      def `should be size 0`: Unit ={
        assert(Set.empty.size === 0)
      }
      def `should produce NoSuchElementException when head is invoked`: Unit ={
        assertThrows[NoSuchElementException]{
          assert(Set.empty.head)
        }
      }
    }
  }

}
