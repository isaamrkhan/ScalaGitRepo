package com.wiley.constructors

class SecondaryConstructor(id:Int, name:String) {

  var age:Int = 0
  var temp:Int = 0

  def showDetails(): Unit ={
    println(id + " " + name + " " + age)
  }

  def this(id:Int, name:String, age:Int){
    this(id, name)
    this.age = age
  }

  def this(id: Int, name: String, age: Int, temp:Int) {
    this(id, name)
    this.age = age
    this.temp = temp
  }

}

object Main2 extends App{

  var s = new SecondaryConstructor(123, "Isaam", 21)
  s.showDetails()
  var s2 = new SecondaryConstructor(123, "Isaam", 21, 5)
  s2.showDetails()

}
