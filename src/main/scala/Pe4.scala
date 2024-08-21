@main def mainPe4(): Unit = {
  import Pe4._
  println("Pe4: " + solve)
}

object Pe4 {
  def solve =
    (100 to 999).view
      .flatMap(i => (i to 999).map(_ * i))
      .filter(n => n.toString == n.toString.reverse)
      .max
}