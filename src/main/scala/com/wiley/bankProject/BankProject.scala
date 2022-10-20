package com.wiley.bankProject

abstract class Customer{
  def CreateAccount(id:Int, name:String, age:Int, balance:Float)
}

class Account extends Customer {


  override def CreateAccount(id:Int, name:String, age:Int, balance:Float): Unit = {
    println("ID: " + id)
    println("Name: " + name)
    println("Age: " + age)
    println("Balance: " + balance)

    println("would you like a loan: yes or no")
    var loanPrompt = scala.io.StdIn.readLine()
    if(loanPrompt == "yes"){
      if(LoanAllowed(balance) == true){
        println("congrats on your loan")
      }
    }
  }

  def LoanAllowed(balance:Float): Boolean ={
    if(balance > 100){
      println("you are eligible for a loan")
      true
    }
    else{
      println("you are not eligible for a loan")
      false
    }
  }


}

/*
class Villain extends Character{
  attack = 30
  defence = 10
  final var shield = 15

  override def Stats(health:Int): Unit = {
    println("health: " + health)
    println("Attack: " + attack)
    println("defence: " + defence)
    println("shield: " + shield)
  }
}

class Minion extends Villain{
  attack = 5
  defence = 5

  override def Stats(health: Int): Unit = {
    println("health: " + health)
    println("Attack: " + attack)
    println("defence: " + defence)
    println("shield: " + shield)
  }
}*/


object BankProject extends App{

  println("How many new accounts would you like to make?")
  var num = scala.io.StdIn.readInt()
  var accSet:Set[Account] = Set()

  for(i <- 0 until num){
    var id = scala.io.StdIn.readInt()
    var name = scala.io.StdIn.readLine()
    var age = scala.io.StdIn.readInt()
    var balance = scala.io.StdIn.readFloat()
    var a = new Account
    a.CreateAccount(id, name, age, balance)
    accSet += a
  }

  for (elem <- accSet) {
    println(elem)
  }


}
