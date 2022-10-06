package com.wiley.objectOriented

class Student {

  //creates a class called student
  var id:Int = 0
  var name:String = null

}

//creates an object for the class
object ExecuteClass extends App{
  var s = new Student()
  println(s.id + " ----> " + s.name)
}