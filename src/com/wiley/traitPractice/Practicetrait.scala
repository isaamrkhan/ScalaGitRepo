package com.wiley.traitPractice

trait Printable{
  def Printing()
}
class A4 extends Printable{
  override def Printing(): Unit = {
    println("its A4 paper")
  }
  
}


object Practicetrait extends App {
  var a =  new A4()
  a.Printing()
}
