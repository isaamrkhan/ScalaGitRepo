package com.wiley.characterProject

import scala.collection.immutable.ListSet
import scala.io.Source
import scala.util.Random

trait PowerUp{
  def powerUp()
}


abstract class Character{
  def Stats(health:Int)
  var attack = 20
  var defence = 20
}

//change function return type to add tests
class Hero extends Character with PowerUp{
  override def powerUp(): Unit = {
    attack += 10
  }

  override def Stats(health:Int): Unit = {
    println("health: " + health)
    println("Attack: " + attack)
    println("defence: " + defence)
  }


}


class Villain extends Character{
  attack = 30
  defence = 10
  final var shield = 15

  override def Stats(health:Int): Unit = {
    println("health: " + health)
    println("Attack: " + attack)
    println("defence: " + defence)
    println("shield: " + shield)
  }
}

class Minion extends Villain{
  attack = 5
  defence = 5

  override def Stats(health: Int): Unit = {
    println("health: " + health)
    println("Attack: " + attack)
    println("defence: " + defence)
    println("shield: " + shield)
  }
}

class Wall{
  var wallGroup = List[Int]()
  def RandomWallSpawn(wallNum: Int): Unit ={
    println("This is a wall with random Health Values from 1 - 10")
    for(i <- 1 to wallNum){
      wallGroup = Random.between(1, 10) :: wallGroup
    }
    println("Here is your wall")
    wallGroup.foreach((x:Int) => print(x + " "))
    //println(wallGroup)
  }

  def SelectedWallSpawn(wallNum: Int): Unit ={
    println("This is a wall with input Health Values")
    for (i <- 1 to wallNum) {
      println("Please input the health for wall number " + i)
      wallGroup = scala.io.StdIn.readInt() :: wallGroup
    }
    println("Here is your wall")
    wallGroup.foreach((x:Int) => print(x + " "))
    //println(wallGroup)
  }

}

object CharacterProject extends App {
  println("Input Hero health: ")
  var hHealth = scala.io.StdIn.readInt()

  println("Hero Stats:")
  var h = new Hero
  h.Stats(hHealth)
  println()

  println("Do you want to power up?")
  var pPrompt = scala.io.StdIn.readLine()

  if (pPrompt == "yes") {
    h.powerUp()
    println("Attack up!")
    println("New Hero Stats:")
    h.Stats(hHealth)
  }

  println()

  println("Input Villain health: ")
  var vHealth = scala.io.StdIn.readInt()
  println()


  println("Villain Stats:")
  var v = new Villain
  v.Stats(vHealth)
  println()

  println("How many minions would you like: ")
  var minionNum = scala.io.StdIn.readInt()
  var count = 1

  while(count < minionNum+1){

    println("Minion" + count + " Stats:")
    var m = new Minion
    v.Stats(25)
    println()
    count += 1
  }

  var w = new Wall
  println("Would you like to input you wall health or keep them random: random or input")
  var randomWallInput = scala.io.StdIn.readLine()
  if (randomWallInput == "input"){
    println("How many walls would you like to spawn")
    var wallNum = scala.io.StdIn.readInt()
    w.SelectedWallSpawn(wallNum)
  }
  else if (randomWallInput == "random"){
    println("How many walls would you like to spawn")
    var wallNum = scala.io.StdIn.readInt()
    w.RandomWallSpawn(wallNum)
  }


  println(Source.fromFile("C:\\Users\\isaam\\OneDrive\\School Stuff\\WileyEdge\\Ending.txt").mkString)



}
