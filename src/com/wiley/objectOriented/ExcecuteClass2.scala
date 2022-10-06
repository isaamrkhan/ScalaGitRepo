package com.wiley.objectOriented

object ExcecuteClass2 extends App {

  var x = scala.io.StdIn.readInt()
  var y = scala.io.StdIn.readLine()

  var s = new Student1(x, y)
  s.show()
}
class Student1(id:Int, name:String) {

  def show(): Unit ={
    println(id + " -----> " + name)
  }

}