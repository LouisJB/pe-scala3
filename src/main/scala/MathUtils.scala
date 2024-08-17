object MathUtils {
  object Primes {
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
}
