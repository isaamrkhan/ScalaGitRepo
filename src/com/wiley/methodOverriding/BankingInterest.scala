package com.wiley.methodOverriding

object BankingInterest extends App {
  var b = new Bank
  b.GetRateOfInterest()
}

class Bank {
  val centralBankRoI = 1

  def GetRateOfInterest(): Int = {
    centralBankRoI
  }
}

class Barclays extends Bank {
  val barclaysRoI = 2

  override def GetRateOfInterest(): Int = {
    super.GetRateOfInterest()+barclaysRoI
  }

}

class NatWest extends Bank {
  val natwestRoI = 5

  override def GetRateOfInterest(): Int = {
    super.GetRateOfInterest()+natwestRoI
  }

}

class Santander extends Bank {
  val santanderRoI = 4

  override def GetRateOfInterest(): Int = {
    super.GetRateOfInterest()+santanderRoI
  }

}

class HSBC extends Bank {
  val hsbcRoI = 3

  override def GetRateOfInterest(): Int = {
    super.GetRateOfInterest()+hsbcRoI
  }

}

