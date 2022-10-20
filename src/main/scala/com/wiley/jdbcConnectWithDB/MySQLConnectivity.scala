package com.wiley.jdbcConnectWithDB

import java.sql._

object MySQLConnectivity extends App {

  val driver = "com.mysql.jdbc.Driver"
  var url = "jdbc:mysql://localhost:3306/MySQL57"
  val username = "root"
  val password = "RootPass"

  // connection instance creation
  var connection:Connection = null
  try{
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    val statement = connection.createStatement()
    val result = statement.executeQuery("select * from movies.movies")
    while(result.next()){
      val title = result.getString("title")
      val genre = result.getString("genre")
      val director = result.getString("director")
      val release_year = result.getString("release_year")
      println(s"title of the movie is ${title}, genre is ${genre}, director is ${director} adn the release year is ${release_year}")

    }
  }
  catch {
    case e:Exception => e.printStackTrace()
  }
  finally{
    connection.close()
  }

}
