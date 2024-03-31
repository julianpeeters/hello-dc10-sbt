package example

import basedir.license
import basedir.readme
import basedir.src.main.scala.example.`Main.scala`
import cats.data.StateT
import dc10.sbt.ast.FileDef
import dc10.sbt.dsl.{BASEDIR, BUILDSBT, LICENSE, README, ROOT, SRC}
import dc10.scala.ErrorF
import dc10.scala.dsl.PACKAGE

val ast: StateT[ErrorF, List[FileDef], Unit] = BASEDIR("/Users/julianpeeters/Workspace/hello-dc10-sbt/target/hello-world", 
  for
    _ <- LICENSE(license)
    _ <- README(readme)
    s <- SRC(PACKAGE("example", `Main.scala`))
    _ <- BUILDSBT(ROOT("hello-world", s))
  yield ())