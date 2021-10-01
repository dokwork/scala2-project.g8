lazy val `$name$` = (project in file("."))
  .settings(		
		organization := "$organization$",
		scalaVersion := "$scala_version$",
		scalacOptions ++= Seq(
			"-encoding",
			"utf-8",
			"-target:jvm-1.8",
			"-deprecation",
			"-feature",
			"-unchecked",
			"-Xlint",
			"-Ywarn-dead-code",
			"-Ywarn-unused",
			"-Xfatal-warnings",
			"-language:higherKinds",
      "-Ypartial-unification"
		),
		libraryDependencies ++= Seq(
			$if(cats.truthy)$
			"org.typelevel" %% "cats-core" % "$cats_version$",
			$endif$
			$if(cats_effect.truthy)$
		  "org.typelevel" %% "cats-effect" % "$cats_effect_version$",
			$endif$
			$if(fs2.truthy)$
			"co.fs2" %% "fs2-core" % "$fs2_version$",
			$endif$
			// tests:
			"org.scalatest" %% "scalatest" % "$scalatest_version$" % "test",
			$if(cats_effect.truthy)$
      "org.typelevel" %% "cats-effect-testing-scalatest" % "1.3.0" % "test"
			$endif$
		)
 	)
  .addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
	.settings(
		coverageMinimum := 90,
		coverageFailOnMinimum := true
	)

