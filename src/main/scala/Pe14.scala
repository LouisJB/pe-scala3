import scala.annotation.tailrec
@main def mainPe14(): Unit = {
  import TimeUtils._
  import Pe14._
  println("Pe14: " + timeMs(solve))
}

object Pe14 {

  def solve = problem14(1 * 1000 * 1000)

  def problem14(target: Int): Int = {
    @tailrec
    def colatzlen(n: Long, len: Int = 0): Int = n match {
      case 1 => len + 1
      case _ =>
        val x = if (n % 2 == 0) n / 2 else 3 * n + 1
        colatzlen(x, len + 1)
    }

    // news flash, doesn't even need memoizing
/*
    import scala.collection.mutable 
    def memoize[A, B](f: A => B): A => B = new mutable.HashMap[A, B]() { self =>
      override def apply(key: A) = self.synchronized(getOrElseUpdate(key, f(key)))
    }
    lazy val colatzlenm: Long => Int = memoize { 
      case x => colatzlen(x)
    }
*/

    (2 until target)
      .map(n => (n, colatzlen(n)))
      .reduceLeft {
        case (next @ (_, len), max @ (_, maxlen)) =>
          if (len > maxlen) next else max
      }._1
  }
}
