
@main def mainPe16(): Unit = {
  import TimeUtils._
  import Pe16._
  println("Pe16: " + timeMs(solve))
}

object Pe16 {
  def solve =
    BigInt(2).pow(1000).toString.view.map(_.asDigit).sum
}
