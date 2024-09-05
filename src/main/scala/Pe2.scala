@main def mainPe2(): Unit = {
  import Pe2._
  import TimeUtils._
  println("Pe2: " + timeMs(solve))
}

object Pe2 {
  import NumberSeqs.Lazy._
  val n = 4 * 1000 * 1000
  def solve =
    fibonacci
      .takeWhile(_ <= n)
      .filter(_ % 2 == 0).sum
}