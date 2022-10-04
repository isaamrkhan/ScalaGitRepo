package com.wiley.scalacohort.training

object Tuples extends App{
  //multiple ways to create tuples, hold multiple variables in one
  val tuple:(String,Int) = ("Isaam", 21)
  val tuple2 = "isaam" -> 21
  val tuple3: (String, Int, Boolean)=("isaam", 21, true)
  //println(tuple)

  //to select a specific part of the tuple, use "_index"
  val name = tuple._1
  val age = tuple._2
  //println(name)

  //this is a way to utilize tuples
  val (myName, myAge) = tuple
  //println(myAge)
  val (_, myAge2) = tuple2
  //println(myAge2)

  //you can create a map using tuples and separate them with mkString
  val data = Map(
    "A" -> 20,
    "B" -> 30,
    "C" -> 10,
    "D" -> 15
  )
  println(data.mkString(" ** "))

  case class Person(name:String, isAdult:Boolean)
  //you make a new person, you want to convert it into Person type, and give it a condition
  val newPerson:(String, Int)  => Person = (name, age) => Person(name, age>18)
  //map the new person to the earlier map
  val users = data.map(newPerson.tupled)
  println(users)
}
