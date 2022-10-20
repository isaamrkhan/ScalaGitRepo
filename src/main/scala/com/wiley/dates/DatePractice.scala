package com.wiley.dates

import java.util.Date
import org.joda.time.DateTime

object DatePractice extends App {

  var d1 = new Date()
  println(d1)

  //the year value starts at 1900
  //month value starts at 0
  val d2 = new Date(120, 1, 12)
  println(d2)

  val today = new DateTime(2022, 3, 26, 12, 0, 0, 0)
  println(today)


}
