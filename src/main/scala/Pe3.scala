@main def mainPe3(): Unit = {
  import Pe3._
  import TimeUtils._
  println("Pe3: " + timeMs(solve))
}

object Pe3 {
  import math.sqrt
  def allFactors(n: Long): List[Long] = (2 to sqrt(n.toDouble).toInt)
    .find(n % _ == 0)
    .fold(List(n))(i => i.toLong :: allFactors(n / i))

  def solve = {
    allFactors(600851475143L).last
  }
}