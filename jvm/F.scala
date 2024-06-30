package macrorepro

import zio._

class F(e: E) {
  val x = e.x
}

object F {
  val layer = ZLayer.derive[F]
}
