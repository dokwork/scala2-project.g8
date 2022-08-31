addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.3")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.31")

$if(for_opensource.truthy)$
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.2")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.3.2")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.1.0")
$endif$
