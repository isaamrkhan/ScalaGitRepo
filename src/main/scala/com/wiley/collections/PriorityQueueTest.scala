package com.wiley.collections

import scala.collection.mutable.PriorityQueue


object PriorityQueueTest extends App {

  case class Donut(name:String, price:Double)

  def donutOrder(d:Donut) = d.price

  var priorityQueue:PriorityQueue[Donut] = PriorityQueue(
    Donut("Plain Donut", 1.50), Donut("Strawberry", 4), Donut("Chocolate", 2.4))(Ordering.by(donutOrder))
  println(s"element of pq are $priorityQueue")

  priorityQueue.enqueue(Donut("Glazed", 3.50))
  priorityQueue += (Donut("Sugar", 1.50))
  println(s"element of pq are $priorityQueue")

  var b: Donut = priorityQueue.dequeue()
  println(b.name)
  println(s"element of pq are $priorityQueue")


}
