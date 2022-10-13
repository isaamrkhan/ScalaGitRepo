package com.wiley.collections

class Bank(value:Int){
  var valueNumber = value

}

class Information(idNum:Int, Fname:String){
  var id = idNum
  var name = Fname
}

object NoneActivity {

  var b = new Bank(1)
  var i = new Information(123, "Isaam")

  val bankRegister:Map[Bank,Information]= Map(b->i)

/*
  def getBankName(bankRegster: Map[Bank, Information], value: Int): Option[Information] = {
    var alpha: Option[Information] = None
    var bankKeys = bankRegster.keys
    var check = false
    for (a <- bankKeys) {
      if (a.valueNumber.equals(value)) {
        alpha = bankRegster.get(a)
        check = true
      }
    }
*/

}

