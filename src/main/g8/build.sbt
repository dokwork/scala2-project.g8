lazy val `$name$` = (project in file("."))
  .settings(		
		organization := "$organization$",
		scalaVersion := "$scala_version$",
		scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-Ypartial-unification"),
		libraryDependencies ++= Seq(
			$if(cats.truthy)$
			"org.typelevel" %% "cats-core" % "1.5.0",
			$endif$
			$if(cats_effect.truthy)$
		  "org.typelevel" %% "cats-effect" % "1.2.0",
			$endif$
			$if(fs2.truthy)$
			"co.fs2" %% "fs2-core" % "1.0.1",
			$endif$
			// tests:
			"org.scalatest" %% "scalatest" % "3.0.0" % "test"
		)
 )
	.settings(
    coverageMinimum := 90,
    coverageFailOnMinimum := true
  )

