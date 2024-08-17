@main def main(): Unit = {
  import TimeUtils._
  import Pe12._
  println("Pe12: " + problem12(500))
  val timedResult = timeAvgMs(100)(problem12(500))
  println(s"timed: $timedResult")
}

object Pe12 {
  import MathUtils.Primes._
  import LazyNumberSeqs._
  def problem12(target: Int) =
    triangles.find(numberOfDivisors(_) > target).getOrElse(0)
}
