package com.wiley.collections

import scala.collection.immutable.Queue

object QueuePractice extends App{

  var queue = Queue(1, 5, 3, 2, 4, 6, 9, 7, 8)
  var queue2:Queue[Int] = Queue(22, 33, 11, 55, 44, 78, 96)

  println(queue)
  println(queue2)

  val firstElement = queue.front
  println(firstElement)
  queue.foreach((element:Int) => {
    //adds 4 to each element in the queue
    println(element+4)
  })

  //adds an element into the rear of the queue
  var enqueue = queue.enqueue(3)
  enqueue.foreach((element:Int) =>{
    println(element)
  })

  //removes element from the front (FIFO)
  var dequeue = queue.dequeue
  println(dequeue)

  val lastElement = queue.last
  println(lastElement)


}
