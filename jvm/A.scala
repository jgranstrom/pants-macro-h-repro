package macrorepro

import zio._

class A {
    val x = 123
}

object A {
  val layer = ZLayer.derive[A]
}
