package com.wiley.priorityThread

class MyThread extends Thread{

  // you can set a daemon thread to behave in a different manner to the other threads
  override def run()={
    if(Thread.currentThread().isDaemon){
      println("daemon thread")
    }
    else{
      println("Other work")
    }
  }

}

object TestThreadUtility extends App {

  var a = new MyThread
  var b = new MyThread
  var c = new MyThread

  a.setDaemon(true)
  a.start()
  b.start()
  c.start()


}
