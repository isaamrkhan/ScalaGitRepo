package com.wiley.readingFromFile

import scala.io.Source

object ReadingFileContent extends App {

  println(Source.fromFile("C:\\Users\\isaam\\OneDrive\\School Stuff\\WileyEdge\\test.txt").mkString)
  println()
  Source.fromFile("C:\\Users\\isaam\\OneDrive\\School Stuff\\WileyEdge\\test.txt").getLines().foreach(i => println("line content: " + i))
  println()
  Source.fromFile("C:\\Users\\isaam\\OneDrive\\School Stuff\\WileyEdge\\test.txt").getLines().take(2).foreach(println)
  println()
  Source.fromFile("C:\\Users\\isaam\\OneDrive\\School Stuff\\WileyEdge\\test.txt").getLines().slice(2, 3).foreach(println)
  println()
  println(Source.fromFile("C:\\Users\\isaam\\OneDrive\\School Stuff\\WileyEdge\\test.txt").toList)

}
