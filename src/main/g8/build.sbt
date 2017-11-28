lazy val root = (project in file("."))
  .settings(
	name := "$name$",
	organization := "$organization$",
	scalaVersion := "2.11.11",
	crossScalaVersions := Seq("2.11.11", "2.12.4"),
	scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
	libraryDependencies ++= Seq(
	  // typesafe:
	  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
	  "com.typesafe" % "config" % "1.3.1",
	  // tests:
	  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
	  "org.mockito" % "mockito-all" % "1.9.5" % "test",
	  "ch.qos.logback" % "logback-classic" % "1.1.7" % "test"
	),
	releaseCrossBuild := true,
	licenses += ("MIT", url("http://opensource.org/licenses/MIT")),
	pomExtra :=
	  <developers>
	    <developer>
	      <id>$developer_id$</id>
	      <name>$developer_name$</name>
	      <url>$developer_url$</url>
	    </developer>
	  </developers>
  )
	.settings(
    coverageMinimum := 90,
    coverageFailOnMinimum := true
  )

