package com.wiley.jdbcConnectWithDB

import org.joda.time.DateTime

import java.util.Date

class CreateThread extends Thread {

  override def run(): Unit ={
    try{
      Thread.sleep(3000)
      println("Do parallel computation here" + Thread.currentThread().getName)
      Thread.sleep(2000)
      println("we are back " + Thread.currentThread().getName + "----" + Thread.currentThread().getPriority)
    }
    catch{
      case e:Exception => e.printStackTrace()
    }

  }

/*  while (true) {
    var d2 = new Date()
    print("\r " + d2)
    Thread.sleep(1000)
  }*/

}

object MainObject extends App{

  var t = new CreateThread()
  var t2 = new CreateThread()
  var t3 = new CreateThread()
  var t4 = new CreateThread()


  //join stops the current thread execution and goes into wait state
  t.start()
  try{
    println("the current thread name is " + Thread.currentThread().getName + " joined by: " + t.getName)
    t.join()
  }
  catch {
    case e: Exception => e.printStackTrace()
  }

  t2.start()
  try {
    println("the current thread name is " + Thread.currentThread().getName)
    t2.join()
  }
  catch {
    case e: Exception => e.printStackTrace()
  }

  t3.start()
  try {
    println("the current thread name is " + Thread.currentThread().getName)
    t3.join()
  }
  catch {
    case e: Exception => e.printStackTrace()
  }

  t4.start()
  try {
    println("the current thread name is " + Thread.currentThread().getName)
    t4.join()
  }
  catch {
    case e: Exception => e.printStackTrace()
  }

}
