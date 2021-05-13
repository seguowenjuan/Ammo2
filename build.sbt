name := """Ammo2"""
organization := "com.se.ds"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.5"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.se.ds.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.se.ds.binders._"
libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0"
)
// https://mvnrepository.com/artifact/com.microsoft.sqlserver/mssql-jdbc
libraryDependencies += "com.microsoft.sqlserver" % "mssql-jdbc" % "9.2.1.jre11"
libraryDependencies += "com.ctrip.framework.apollo" % "apollo-client" % "1.8.0"


