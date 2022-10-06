package com.wiley.inheritance

object BasicInheritance extends App {
  new BusinessPeron

}

class Employee{
  var salary:Int = 50000
}

class Programmer extends Employee {
  var bonus:Int = 5000
  println(salary)
  println(bonus)
}

class BusinessPeron extends Employee {
  var bonus:Int = 9000
  println(salary)
  println(bonus)
}