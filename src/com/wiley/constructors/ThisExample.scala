package com.wiley.constructors

class ThisExample {

  var id:Int = 0
  var name:String = ""

  def this(id:Int, name:String){
    this()
    this.id = id
    this.name = name
  }

  def show(): Unit ={
    println(id + " " + name)
  }

}

object T extends App{
  var t = new ThisExample(1, "Isaam")
  t.show()

}