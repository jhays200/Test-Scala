name := "Test-Scala"

version := "0.1"

description := "Testing Spray functionality for Scala"

scalaVersion := "2.10.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
	"spray repo" at "http://repo.spray.io"
)

libraryDependencies ++= Seq(
	"io.spray" % "spray-can" % "1.1-M7",
	"io.spray" %%  "spray-json" % "1.2.3",
	"com.typesafe.akka" %% "akka-actor" % "2.1.0"
)
