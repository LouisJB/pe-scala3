@main def mainPe1(): Unit = {
  import Pe1._
  println("Pe1: " + solve)
}

object Pe1 {
  def solve =
    (3 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).sum
}