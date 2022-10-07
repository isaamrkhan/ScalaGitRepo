package com.wiley.inheritance

trait A{
  var salary = 10000
}

class B extends A {
  var salary2 = 20000
}

//can extend only one class, but multiple traits
class C extends B with A{
  def show(): Unit ={
    println("Salary  = " + salary)
    println("Salary 2 = " + salary2)

  }
}

object MultiLevelInheritance extends App {
  var c = new C
  c.show()

}
