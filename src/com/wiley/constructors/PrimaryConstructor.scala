package com.wiley.constructors

class PrimaryConstructor(id:Int, name:String) {

  def showDetails(): Unit ={
    println(id + " " + name)
  }
}

object temp extends App {
  var s = new PrimaryConstructor(314, "Isaam")
  s.showDetails()
}
