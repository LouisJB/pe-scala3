import scala.annotation.tailrec
object MathUtils {
  import Math._
  object Primes {
    lazy val primes: LazyList[Int] = 2 #:: LazyList.from(3).filter { p =>
      primes.takeWhile(x => x * x <= p)
             .forall(p % _ > 0)
    }

    lazy val primes2 = {
      def sieve(s: LazyList[Int]): LazyList[Int] = // not tailrec warning
        s.head #:: sieve(s.tail filter (_ % s.head != 0))
      sieve(LazyList.from(2))
    }

    def primeFactors(x: Int): List[Int] = {
      def ff(x: Int, n: Int): List[Int] = if (n * n > x) x :: Nil else
        x % n match {
          case 0 => n :: ff(x / n, n)
          case _ => ff(x, n + 1)
      }
      ff(x, 2)
    }
    def numberOfDivisors(n: Int) =
      primeFactors(n).groupBy(identity)
        .view.mapValues(_.length + 1)
        .values
        .reduce(_ * _)
  }

  object ArithmeticSeries {
    def arithmeticSum(n: Int): Int =
      (n * (n + 1)) / 2
    def arithmeticSeqSum(n: Int)(d: Int) =
      d * arithmeticSum(floorDiv(n, d))
  }
  def sqr(x : Int) = x * x
}

object PrmesApp {
  import MathUtils.Primes._
  import TimeUtils._
  def main(args: Array[String]) = {
    val n = 1000
    val ps1 = timeMs(primes.take(n).toList.drop(n-10))
    println(ps1)
    val ps2 = timeMs(primes2.take(n).toList.drop(n-10))
    println(ps2)
  }
}