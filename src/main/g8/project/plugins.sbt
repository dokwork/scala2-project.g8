addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.2")

addSbtPlugin("ru.dokwork" % "sbt-keepup" % "0.1.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.6")

$if(use_bintray.truthy)$
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")
$endif$