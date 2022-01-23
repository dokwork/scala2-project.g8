# scala2.g8

This is a template for scala2 projects which includes `scalatest` as dependency and some more dependencies for your chose:

* cats
* cats-effect
* fs2

Besides it this project depend on some plugins:

* sbt-scoverage
* sbt-coveralls
* sbt-scalafmt
* sbt-release

Generated files structure:

```
scala2-example
├── .gitignore
├── .scalafmt.conf
├── LICENSE
├── build.sbt
├── project
│   ├── build.properties
│   └── plugins.sbt
└── version.sbt
```

## How to use it

With `sbt`:

`sbt new dokwork/scala2.g8`

With `Gitter8`:

1. Install `giter8` as described here: http://www.foundweekends.org/giter8/setup.html
1. Use it! `g8 dokwork/scala2.g8`

