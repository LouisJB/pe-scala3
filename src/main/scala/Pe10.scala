@main def mainPe10(): Unit = {
  import Pe10._
  import TimeUtils._
  println("Pe10: " + timeMs(solve))
}

object Pe10 {
  import MathUtils.Primes._
  val n = 2 * 1000 * 1000
  def solve = 
    primes.takeWhile(_ < n).product
}