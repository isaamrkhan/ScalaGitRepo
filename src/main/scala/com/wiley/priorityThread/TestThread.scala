package com.wiley.priorityThread

import com.wiley.jdbcConnectWithDB.CreateThread

object TestThread extends App {
  var t = new CreateThread()
  var t2 = new CreateThread()
  var t3 = new CreateThread()
  var t4 = new CreateThread()
  t.setPriority(6)
  t2.setPriority(9)
  t3.setPriority(7)
  t4.setPriority(10)

  t.start()
  t2.start()
  t3.start()
  t4.start()

/*

  //join stops the current thread execution and goes into wait state
  t.start()
  try {
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

*/

}
