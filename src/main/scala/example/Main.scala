package example

import cats.effect.{IO, IOApp, ExitCode} 
import cats.effect.IO.asyncForIO
import dc10.io.toFile
import dc10.sbt.compiler
import dc10.sbt.version.`1.9.9`

object Main extends IOApp:
  def run(args: List[String]): IO[ExitCode] =
    ast.compile.toFile["sbt-1.9.9"].as(ExitCode.Success)