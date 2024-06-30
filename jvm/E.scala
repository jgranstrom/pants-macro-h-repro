package macrorepro

import zio._

class E(d: D) {
  val x = d.x
}

object E {
  val layer = ZLayer.derive[E]
}
