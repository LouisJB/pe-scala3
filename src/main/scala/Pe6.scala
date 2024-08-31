@main def mainPe6(): Unit = {
  import Pe6._
  import TimeUtils._
  println("Pe6: " + timeMs(solve))
}

object Pe6 {
  import MathUtils._
  def solve = {
    val ns = (1 to 100)
    sqr(ns.sum) - ns.map(sqr).sum
  }
}
