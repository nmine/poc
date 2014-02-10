import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "pocplay"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "com.google.guava" % "guava" % "14.0",
    "mysql" % "mysql-connector-java" % "5.1.18",
     "securesocial" %% "securesocial" % "master-SNAPSHOT"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
      resolvers += Resolver.url("sbt-plugin-snapshots",url("http://repo.scala-sbt.org/scalasbt/sbt-plugin-snapshots/"))
      (Resolver.ivyStylePatterns)
  )

}
