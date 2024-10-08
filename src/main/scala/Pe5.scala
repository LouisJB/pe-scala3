@main def mainPe5(): Unit = {
  import Pe5._
  import TimeUtils._
  println("Pe5: " + timeMs(solve))
}

object Pe5 {
  def solve = (20 until Int.MaxValue)
    .find(n => (2 to 20)
    .forall(n % _ == 0)).get
}