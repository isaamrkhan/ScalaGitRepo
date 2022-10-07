package com.wiley.accessModifiers

//No Modifier / Public = Class(Yes), Companion(Yes), Subclass(Yes), Package(Yes), World(Yes)
//^ Least restrictive

//Protected = Class(Yes), Companion(Yes), Subclass(Yes), Package(No), World(No)
//^ More restrictive than public, but less so that private

//Private = Class(Yes), Companion(Yes), Subclass(No), Package(No), World(No)
//^ Most restrictive


class AccessExample2{
  protected var a:Int = 20
}

class tempClass extends AccessExample2 {

  def display(): Unit ={
    println(a)
  }

}

object AccessTest2 extends App {
  var s = new tempClass
  s.display()

}
