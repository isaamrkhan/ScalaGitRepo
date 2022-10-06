package com.wiley.customer

class StudentRecord (id:Int, name:String) {

  def getRecord(): Unit ={
    println(id + " " + name)
  }

  def saveRecord(): Unit ={
    var tuple:(Int, String) = (id, name)
    var list = List[(Int, String)]()
    print(List[(Int, String)]() :+ tuple)

  }

}

object MainObject extends App {
  var count = 0

  while(count < 5){
    var x = scala.io.StdIn.readInt()
    var y = scala.io.StdIn.readLine()
    var student = new StudentRecord(x, y)
    student.saveRecord()
    count += 1
  }

}
