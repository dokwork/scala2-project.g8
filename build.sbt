lazy val root = (project in file("."))
  .settings(
	name := "GIVE ME NAME!"
	version := "0.1.0-SNAPSHOT"
	organization := "com.github.dokwork"
	scalaVersion := "2.12.4"
	crossScalaVersions := Seq("2.11.11", "2.12.4")
	scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
	libraryDependencies ++= Seq(
	  // typesafe:
	  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
	  "com.typesafe" % "config" % "1.3.1",
	  // tests:
	  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
	  "org.mockito" % "mockito-all" % "1.9.5" % "test",
	  "ch.qos.logback" % "logback-classic" % "1.1.7" % "test"
	)
	pomExtra :=
	  <developers>
	    <developer>
	      <id>dokwork</id>
	      <name>Vladimir Popov</name>
	      <url>http://dokwork.ru</url>
	    </developer>
	  </developers>
  )

