name := "hello-world"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.0.play24"
)


fork in run := true
