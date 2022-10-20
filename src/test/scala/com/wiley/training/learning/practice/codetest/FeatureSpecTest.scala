package com.wiley.training.learning.practice.codetest

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec

class TVSet{
  private var on:Boolean = false
  def isOn:Boolean = on
  def pressPowerButton(): Unit ={
    on = !on
  }
}

class FeatureSpecTest extends AnyFeatureSpec with GivenWhenThen{

  info("As a tv set owner")
  feature("TV power button"){
    scenario("User press power button when tc is off"){
      Given("A tv set is switched off")
      val tv = new TVSet
      assert(!tv.isOn)

      When("then the power button is preseed")
      tv.pressPowerButton()

      Then("check tv is on or not")
      assert(tv.isOn)
    }
/*    scenario("User presses power button when tv in on"){
      Given("A tv set is switched on"){
        val tv = new  TVSet
        tv.pressPowerButton()
        assert(tv.isOn)

        When("the power button is pressed"){
          tv.pressPowerButton()

          Then("check if tv is off")
          assert(!tv.isOn)
        }
      }
    }*/
  }

}
