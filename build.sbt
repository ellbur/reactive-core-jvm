
organization := "com.github.ellbur"

name := "reactive-core-js-2"

version := "0.3.1"

description := "An FRP framework"

scalaVersion := "2.12.1"

unmanagedSourceDirectories in Compile <++= (scalaBinaryVersion, baseDirectory) { (sv, bd) => Seq(bd / "src" / "main" / ("scala-"+sv)) }

enablePlugins(ScalaJSPlugin)

