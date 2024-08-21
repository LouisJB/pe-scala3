@main def mainPe5(): Unit = {
  import Pe5._
  println("Pe5: " + solve)
}

object Pe5 {
  def solve = (20 until Int.MaxValue)
    .find(n => (2 to 20).forall(n % _ == 0)).get
}