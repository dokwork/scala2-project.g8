# scala-project.g8

This is a template for scala2 projects which includes `scalatest` as dependency and some more dependencies for your chose:

* cats
* cats-effect
* fs2

Besides it this project depend on some plugins:

* sbt-scoverage
* sbt-coveralls
* sbt-scalafmt
* sbt-release

## How to use it
1. Install `giter8` as described here: http://www.foundweekends.org/giter8/setup.html
1. Use it!`g8 dokwork/scala2-project.g8`


## Why it doesn't work with sbt
Read answer here:  https://stackoverflow.com/questions/49461001/truthy-doesnt-work-with-sbt-new
