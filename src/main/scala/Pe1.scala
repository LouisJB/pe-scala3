@main def mainPe1(): Unit = {
  import Pe1._
  println("Pe1: " + solve)
}

object Pe1 {
  import MathUtils.ArithmeticSeries._
  val n = 999
  def solve = {
    val sumN = arithmeticSeqSum(n)
    sumN(3) + sumN(5) - sumN(15)
  }
  def solveBf =
    (3 to n).filter(x => x % 3 == 0 || x % 5 == 0).sum
}