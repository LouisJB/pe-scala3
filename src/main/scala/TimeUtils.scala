object TimeUtils {
  case class Timed[A](value: A, time: Long) {
    override def toString = s"Result $value took $time ms"
  }
  def timeMs[A](fn: => A): Timed[A] = {
    val start = System.currentTimeMillis()
    Timed(fn, System.currentTimeMillis() - start)
  }
  def timeAvgMs[A](n: Int)(fn: => A): Timed[A] = {
    val result = timeMs((1 to n).map(_ => fn).head)
    Timed[A](result.value, result.time / n)
  }
}
