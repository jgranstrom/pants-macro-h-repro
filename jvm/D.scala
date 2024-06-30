package macrorepro

import zio._

class D(c: C) {
  val x = c.x
}

object D {
  val layer = ZLayer.derive[D]
}
