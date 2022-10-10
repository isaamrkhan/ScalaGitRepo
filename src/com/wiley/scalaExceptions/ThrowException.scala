package com.wiley.scalaExceptions

class ThrowException {

  def validate(age:Int): Unit ={
    if(age<18){
      throw new ArithmeticException("you are not eligible")
    }
    else{
      println("You are eligible")
    }
  }
}

object MainObject{
  def main(args: Array[String]): Unit = {
    var e = new ThrowException
    e.validate(20)
  }
}
