name := """hello-scala"""

version := "1.0"

scalaVersion := "2.11.7"

//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.apache.spark" %% "spark-core_2.10" % "1.5.2"
)



fork in run := true
