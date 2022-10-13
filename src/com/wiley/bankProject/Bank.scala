package com.wiley.bankProject

abstract class Bank {
  var customer:Set[Customer] = Set()

  def AddCustomer(id:Int, name:String, age:Int)

}

class Customer extends Bank {
  override def AddCustomer(id: Int, name: String, age: Int): Unit = {
    println(id)
    println(name)
    println(age)
  }
}

class Account extends Customer {

  def CreateAccount(id: Int, balance: Double): Unit = {
    println("Id: " + id)
    println("Balance: " + balance)
  }

  def CashWithdrawl(sub:Int): Unit ={
    //println(balance - sub)
  }

}


object MainBank extends App{

  var accounts:Set[Account] = Set()

/*
  println("Would you like a new account: ")
  println("y or n")
  val ans = scala.io.StdIn.readLine()
  if(ans == "yes"){
    println("input your ID: ")
    var inpId = scala.io.StdIn.readInt()
    println("input your Balance: ")
    var inpBal = scala.io.StdIn.readDouble()
    var x = new Account()
    x.CreateAccount(inpId, inpBal)
  }
*/

  println("input your ID: ")
  var inpId = scala.io.StdIn.readInt()
  println("input your Balance: ")
  var inpBal = scala.io.StdIn.readDouble()
  var x = new Account()
  x.CreateAccount(inpId, inpBal)
 accounts += x
  print(accounts(x))

  var cust1 = new Customer
  cust1.AddCustomer(123, "Isaam", 21)


}
