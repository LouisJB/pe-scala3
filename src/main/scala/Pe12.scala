@main def mainPe12(): Unit = {
  import TimeUtils._
  import Pe12._
  println("Pe12: " + solve)
  val timedResult = timeAvgMs(100)(solve)
  println(s"timed: $timedResult")
}

object Pe12 {
  import MathUtils.Primes._
  import LazyNumberSeqs._
  def solve = problem12(500)
  def problem12(target: Int) =
    triangles.find(numberOfDivisors(_) > target).getOrElse(0)
}