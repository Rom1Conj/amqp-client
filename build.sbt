name := "amqp-client"

organization := "com.github.sstone"

version := "1.6-MICS-2_13"

scalaVersion := "2.13.7"

crossScalaVersions := Seq("2.13.7")

scalacOptions ++=
  Seq("-feature", "-language:postfixOps", "-deprecation")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

publishTo :=
  Some(
    "Sonatype Nexus Repository Manager" at
      "https://sf-nexus.mediarithmics.com/repository/thirdparty/"
  )

libraryDependencies := {
  val akkaVersion = "2.5.32"
  Seq(
    "com.rabbitmq" % "amqp-client" % "3.5.7",
    "com.typesafe.akka" %% "akka-actor" % akkaVersion % "provided",
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
    "org.scalatest" %% "scalatest" % "3.0.8" % "test",
    "ch.qos.logback" % "logback-classic" % "1.1.2" % "test",
    "junit" % "junit" % "4.12" % "test"
  )
}
