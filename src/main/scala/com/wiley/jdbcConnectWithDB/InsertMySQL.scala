package com.wiley.jdbcConnectWithDB

import java.sql.{Connection, DriverManager, PreparedStatement}

object InsertMySQL extends App {


  val driver = "com.mysql.jdbc.Driver"
  var url = "jdbc:mysql://localhost:3306/movies"
  val username = "root"
  val password = "RootPass"

  // connection instance creation
  var connection: Connection = null
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    val insertMySQL = """INSERT INTO movies (title,genre,director,release_year) values(?,?,?,?)"""
    val preparedStatement:PreparedStatement = connection.prepareStatement(insertMySQL)
    preparedStatement.setString(1, "testTitle")
    preparedStatement.setString(2, "testGenre")
    preparedStatement.setString(3, "testDirector")
    preparedStatement.setString(4, "2022")
    preparedStatement.execute()

  }
  catch {
    case e: Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }

}
