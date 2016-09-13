name := "cooccurrence-driver"

organization := "com.finderbots"

version := "0.1"

scalaVersion := "2.10.4"

val sparkVersion = "1.1.1"

libraryDependencies ++= Seq(
  "log4j" % "log4j" % "1.2.17",
  // Mahout's Spark code
  "commons-io" % "commons-io" % "2.4",
  "org.apache.mahout" % "mahout-math-scala_2.10" % "0.10.0",
  "org.apache.mahout" % "mahout-spark_2.10" % "0.10.0",
  "org.apache.mahout" % "mahout-math" % "0.10.0",
  "org.apache.mahout" % "mahout-hdfs" % "0.10.0",
  // Google collections, AKA Guava
  "com.google.guava" % "guava" % "16.0")

resolvers += "typesafe repo" at " http://repo.typesafe.com/typesafe/releases/"

resolvers += Resolver.mavenLocal

// Select which Hadoop version to use
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.2.0"

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "2.11.4"

libraryDependencies += "org.mongodb.mongo-hadoop" % "mongo-hadoop-core" % "1.3.2"


