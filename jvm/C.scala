package macrorepro

import zio._

class C(b: B) {
  val x = b.x
}

object C {
  val layer = ZLayer.derive[C]
}
