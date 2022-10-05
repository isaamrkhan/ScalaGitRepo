package com.wiley.scalacohort.training

object NameVersion extends App {

  var version = util.Properties.versionString

  println("Isaam Khan, " + version)

  println(util.Properties.ScalaCompilerVersion + util.Properties.copyrightString + util.Properties.developmentVersion)


}
