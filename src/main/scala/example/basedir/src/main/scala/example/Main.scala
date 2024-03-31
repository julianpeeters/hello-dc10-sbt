package example.basedir.src.main.scala.example

import dc10.cats.effect.dsl.{IO, IOAPP, PRINTLN, RUN}
import dc10.scala.dsl.{FILE, given}
import scala.language.implicitConversions

val `Main.scala` =
  FILE("Main.scala",
    IOAPP("Main",
      RUN(IO.PRINTLN("hello, world!"))
    )
  )