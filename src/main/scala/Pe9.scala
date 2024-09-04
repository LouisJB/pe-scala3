@main def mainPe9(): Unit = {
  import Pe9._
  import TimeUtils._
  println("Pe9: " + timeMs(solve))
}

object Pe9 {
  import MathUtils._
  def solve = {
    for {
      _ <- List(())
      upperBound = (1 to 1000).find(n => n * math.sqrt(2) >= 1000).get
      a <- 2 to upperBound
      b <- 2 until a - 1;
      c = 1000 - a - b
      if sqr(a) + sqr(b) == sqr(c)
    } yield a * b * c
  }.head
}