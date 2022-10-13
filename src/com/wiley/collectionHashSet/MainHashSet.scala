package com.wiley.collectionHashSet

import scala.collection.immutable.HashSet

object MainHashSet extends App{

  var hashSet2 = HashSet("Isaam", "Usman", "Sarah", "Rashid")
  var hashSet = HashSet(23, 1, 2, 3, 4, 5, 6, 7, 8, 9, 234)

  hashSet.foreach((element:Int) => println(element))

  hashSet2.foreach((element2:String)=>{
    println("insert name:  '" + element2 + "'")
  })

}
