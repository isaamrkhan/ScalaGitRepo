package com.wiley.activities

class TripleConstructor(var fName: String, var lName: String) {

  var age:Int = 21

  def this(fName:String, lName:String, age:Int){
    this(fName, lName)
    this.age = age
  }

  def show: Unit ={
    println("First Name: " + fName + " Last Name: " + lName + " Age: " + age)
  }

}

object Main extends App{
  new TripleConstructor("Isaam", "Khan").show
}
