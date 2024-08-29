@main def mainPe7(): Unit = {
  import Pe7._
  println("Pe7: " + solve)
}

object Pe7 {
  import MathUtils.Primes._
  def solve = primes(10000)
}