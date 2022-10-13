package com.wiley.collections

object TypeHierarchy extends App {

  println("Declare a variable of type Any")
  val favouriteItem: Any = "Glazed Donut"
  println(favouriteItem)

  println("Declare a type of AnyRef")
  val pizza: AnyRef = "Cheese Pizza"
  println(pizza)

  println("Declare a variable of type AnyVal")
  val price:AnyVal = 4.5
  println(price)

  //Nil is an empty singleton object
  val myList = Nil
  println(myList.length)


}
