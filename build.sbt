val CatsV = "2.10.0"

inThisBuild(List(
  Compile / run / fork := true,
  crossScalaVersions := Seq(scalaVersion.value),
  description := "Managed projects",
  organization := "com.julianpeeters",
  homepage := Some(url("https://github.com/julianpeeters/hello-dc10-sbt")),
  licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  developers := List(
    Developer(
      "julianpeeters",
      "Julian Peeters",
      "julianpeeters@gmail.com",
      url("http://github.com/julianpeeters")
    )
  ),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-Werror",
    "-source:future",
    "-Wunused:all",
    "-Wvalue-discard"
  ),
  scalaVersion := "3.4.0",
  versionScheme := Some("semver-spec"),
))

lazy val root = (project in file("."))
  .settings(
    name := "hello-dc10-sbt",
    libraryDependencies ++= Seq(
      "com.julianpeeters" %% "dc10-cats-effect" % "0.2.1",
      "com.julianpeeters" %% "dc10-io"          % "0.4.0",
      "com.julianpeeters" %% "dc10-sbt"         % "0.2.0",
    )
  )