package com.wiley.enumeration

object MilkyWay extends Enumeration {

  type Planets = Value
  val mercury, venus, earth, mars, saturn, jupiter, neptune, uranus = Value
  val pluto = Value(9, "Pluto")
  val zoto = Value(10, "Zoto")

  def isMilkyWay(planets: Planets): Unit ={
    println(s"Planet ${planets.id} is ${planets}")
  }

  def isPlanet(planets: String): Unit ={
    val check = MilkyWay.values.toList.map(v => v.toString).contains(planets)
    println(s"planet $planets belongs to milky way? $check")
  }

  def main(args: Array[String]): Unit = {
    isMilkyWay(MilkyWay.mercury)
    isMilkyWay(MilkyWay.mars)
    isMilkyWay(MilkyWay.earth)
    isMilkyWay(MilkyWay.venus)
    isMilkyWay(MilkyWay.uranus)
    isPlanet("earth")
  }

}
