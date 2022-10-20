package com.wiley.enumeration

object DonutsEnumeration extends App {

  object Donut extends Enumeration{
    type Donut = Value

    val glazed = Value("Glazed")
    val strawberry = Value("Strawberry")
    val plain = Value("Plain")
    val vanilla = Value("Vanilla")

  }

  println(s"vanilla donut value is ${Donut.vanilla}")
  println(s"Vanilla id is ${Donut.vanilla.id}")
  println(s"All values ${Donut.values}")

  Donut.values.foreach{
    case d if(d == Donut.strawberry || d == Donut.glazed) =>{
      println(d + " is my favourite")
    }
    case x => println(x + " is not my favourite")
  }

}
