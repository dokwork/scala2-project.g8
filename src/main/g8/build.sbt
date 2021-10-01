organization in ThisBuild := "$organization$"
scalaVersion in ThisBuild := "$scala_version$"

semanticdbEnabled in ThisBuild := true
semanticdbVersion in ThisBuild := scalafixSemanticdb.revision
scalafixDependencies in ThisBuild += "com.github.liancheng" %% "organize-imports" % "0.5.0"

lazy val compilerOptions = Seq(
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
)

lazy val dependencies = new {
  val versions = new {
		$if(cats.truthy)$
    val cats          = "$cats_version$"
		$endif$
		$if(cats_effect.truthy)$
    val catsEffect    = "$cats_effect_version$"
    val stCatsEffect  = "0.3.1"
		$endif$
		$if(fs2.truthy)$
    val fs2           = "$fs2_version$"
		$endif$
    val scalatest     ="$scalatest_version$" 
  }

	$if(cats.truthy)$
  val cats          = "org.typelevel"     %% "cats-core"       % versions.cats
	$endif$
	$if(cats_effect.truthy)$
  val catsEffect    = "org.typelevel"     %% "cats-effect"                   % versions.catsEffect
  val stCatsEffect  = "org.typelevel"     %% "cats-effect-testing-scalatest" % versions.stCatsEffect
	$endif$
	$if(fs2.truthy)$
  val fs2           = "co.fs2"            %% "fs2-core"                      % versions.fs2
	$endif$
  val scalatest     = "org.scalatest"     %% "scalatest"                     % versions.scalatest

  val runtime = Seq(cats, catsEffect, fs2)
  val test    = Seq(scalatest, stCatsEffect).map(_ % "test")
}


lazy val `$name$` = (project in file("."))
  .settings(
    scalacOptions ++= compilerOptions,
    libraryDependencies ++= dependencies.runtime ++ dependencies.test,
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
 	  addCompilerPlugin(
      ("org.typelevel" %% "kind-projector" % "0.11.3").cross(CrossVersion.full)
    ),
		coverageMinimum := 90,
		coverageFailOnMinimum := true
)
