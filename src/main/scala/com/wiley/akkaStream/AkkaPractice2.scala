package com.wiley.akkaStream

import akka.actor.typed._
import akka.actor.typed.javadsl.Behaviors
import akka.stream.scaladsl.{Flow, Sink, Source}

import scala.concurrent.{ExecutionContext, Future}

object AkkaPractice2 {
  //actorSysterm is a group of threads in the background
  implicit val system = ActorSystem(Behaviors.empty, "ScalaCohort")
  implicit val ec: ExecutionContext = system.executionContext

  val source = Source(1 to 10000)
  val flow = Flow[Int].map(x => x * 2)
  val sink = Sink.foreach[Int](x => println(x))

  val asyncFlow = Flow[Int].mapAsync(4) {
    x => {
      Future {
        x * 4
      }
    }
  }

  val fastSource = Source(1 to 10000).via(asyncFlow).map{
    x =>{
      println("waiting for consumer" + x)
      x
    }
  }.async

  val slowSink = Sink.foreach[Int]{
    x =>{
      Thread.sleep(1000)
      println(x)
    }
  }

  def main(args: Array[String]): Unit = {
    fastSource.to(slowSink).run()
  }


}
