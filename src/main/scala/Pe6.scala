@main def mainPe6(): Unit = {
  import Pe6._
  println("Pe6: " + solve)
}

object Pe6 {
  import MathUtils._
  def solve = {
    val ns = (1 to 100)
    sqr(ns.sum) - ns.map(sqr).sum
  }
}
