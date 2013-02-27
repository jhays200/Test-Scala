name := "Test-Scala"

version := "0.1"

description := "Testing Spray functionality for Scala"

scalaVersion := "2.10.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
	"spray repo" at "http://repo.spray.io"
	//"com.typesafe.akka" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
	"org.apache.httpcomponents" % "httpclient" % "4.2.3",
	"io.spray" %%  "spray-json" % "1.2.3"
	//"io.spray" % "spray-io" % "1.1-M7",
	//"io.spray" % "spray-http" % "1.1-M7",
	//"io.spray" % "spray-util" % "1.1-M7",
	//"com.typesafe.akka" %% "akka-actor" % "2.1.1",
	//"com.typesafe.akka" %% "akka-slf4j" % "2.1.1",
	//"ch.qos.logback" % "logback-classic" % "1.0.9"
)
