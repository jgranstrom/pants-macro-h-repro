package macrorepro

import zio._

class B(a: A) {
  val x = a.x
}

object B {
  val layer = ZLayer.derive[B]
}
