package macrorepro

import zio._

object Main extends ZIOAppDefault {
  def run = (for {
    f <- ZIO.service[F]
    _ <- ZIO.succeed(println(f.x))
  } yield f)
    .provide(A.layer, B.layer, C.layer, D.layer, E.layer, F.layer)
}
