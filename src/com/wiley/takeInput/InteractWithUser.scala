package com.wiley.takeInput

object InteractWithUser extends App {

  /*println("What is your first name: ")
  var name = scala.io.StdIn.readLine()

  println("What is your age: ")
  var age = scala.io.StdIn.readInt()

  println("Your name is: " + name + "\nYour age is: " + age)*/

  /*val currency = java.text.NumberFormat.getCurrencyInstance

  println("10 donuts for $2.50 each")
  var price:Double = 2.50
  println("total cost of 10 glazed donuts = " + currency.format(price*10))


  println("What is your favourite movie of all time?")
  var movie = scala.io.StdIn.readLine()
  println(movie + " is totally awesome!")


  println("what is your full name and your favourite movie?")
  var fname = scala.io.StdIn.readLine()
  var lname = scala.io.StdIn.readLine()
  var fmovie = scala.io.StdIn.readLine()

  println("First Name: " + fname)

  println("Last Name: " + lname)

  println("Favourite movie: " + fmovie)*/


 /* println("please write 2 separate Strings")
  var word1 = scala.io.StdIn.readLine()
  var word2 = scala.io.StdIn.readLine()

  println(word1+word2)



  println("what word and character would you like to use")
  var wordx = scala.io.StdIn.readLine()
  var char = scala.io.StdIn.readChar()
  var count = 0

  for (i <- wordx) {
    if(i == char){
      count += 1
    }
  }
  println("the word "+ wordx + " has the letter " + char + " ," + count + " amount of times")
*/

  var word = "Demogorgon"
  println(word.length)


  println("hello".reverse)

  var wordreverse = scala.io.StdIn.readLine()
  for (i <- wordreverse) {
    print(i)
  }
  if (wordreverse == wordreverse.reverse) {
    println("true")
  }
  else{
    println("false")
  }

}
