/*
package com.wiley.training.learning.practice.codetest

import org.scalatest.matchers.must.Matchers.be
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.propspec.AnyPropSpec

import scala.collection.immutable.{BitSet, HashSet, TreeSet}


class PropSetSpecTest extends AnyPropSpec with TableDrivenPropertyCheckswith {

  val examples Table("Set",BitSet.empty, HashSet.empty[Int], TreeSet.empty[Int])
  property("an empty set has a size of 0"){
    forAll(examples){
      set => {
        assert(set.size === 0)
      }
    }
  }

}
*/
