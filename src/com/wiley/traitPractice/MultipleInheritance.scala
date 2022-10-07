package com.wiley.traitPractice

trait Printable1{
  def printing()
}

trait Showable{
  def show(): Unit ={
    println("testing")
  }
}

class A6 extends Printable with Showable{
  override def Printing(): Unit = {
    println("test")
  }

  override def show(): Unit = {
    println("test 2")
  }
}

object MultipleInheritance extends App {

  var paper = new A6
  paper.show()
  paper.Printing()

}
