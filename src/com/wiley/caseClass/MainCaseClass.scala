package com.wiley.caseClass

trait SuperTrait

case class MainCaseClass(a:Int, b:Int) extends SuperTrait
case class SecondCaseClass(a:Int) extends  SuperTrait
case object CaseObject extends SuperTrait

object MainClass extends App{
  callCase(MainCaseClass(2, 4))
  callCase(SecondCaseClass(6))
  callCase(CaseObject)

  def callCase(f:SuperTrait)= f match{
    case MainCaseClass(x, y) => println("a= " + x + " b= " + y)
    case SecondCaseClass(x) => println("a= " + x)
    case CaseObject => println("no argument")
  }
}