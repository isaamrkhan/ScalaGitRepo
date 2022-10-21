package com.wiley.akkaStream

import akka.actor.typed._
import akka.actor.typed.javadsl.Behaviors
import akka.stream.scaladsl.{Flow, Sink, Source}

import scala.concurrent.{ExecutionContext, Future}

object AkkaPractice {

  //actorSysterm is a group of threads in the background
  implicit val system = ActorSystem(Behaviors.empty, "ScalaCohort")
  implicit val ec:ExecutionContext = system.executionContext

  val source = Source(1 to 10000)
  val flow = Flow[Int].map(x => x*2)
  val sink = Sink.foreach[Int](x => println(x))
  val firstGraph = source.via(flow).to(sink)

  val asyncFlow = Flow[Int].mapAsync(4){
    x=>{
      Future{
        x*4
      }
    }
  }

  def main(args: Array[String]): Unit = {
    println("Welcome to akka world")

    //firstGraph.run()
    source.via(asyncFlow).to(sink).run()
  }

}
