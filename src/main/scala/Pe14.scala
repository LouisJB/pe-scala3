import scala.annotation.tailrec
@main def mainPe14(): Unit = {
  import TimeUtils._
  import Pe14._
  println("Pe14: " + timeMs(solve))
}

object Pe14 {
  
  def solve = problem14(1 * 1000 * 1000)

  def problem14(target: Int): Int = {
    import scala.collection.mutable 
    def memoize[A, B](f: A => B): A => B = new mutable.HashMap[A, B]() { self =>
      override def apply(key: A) = self.synchronized(getOrElseUpdate(key, f(key)))
    }

    @tailrec
    def colatz(x: Long, d: Int = 1): Int =  { x match {
      case 1 => d
      case a =>
        val n = if (a % 2 == 0) a/2 else a*3+1 
        colatz(n, d+1)
      }
    }

    lazy val colaztm: Long => Int = memoize { 
      case x => colatz(x)
    }

    (2 until target).foldLeft((1, 1)) { case ((mx, ml), x) => 
      val l = colaztm(x)
      if (l > ml) (x, l) else (mx, ml)
    }._1
  }
}
