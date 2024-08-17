object NumberSeqs {
  object Lazy {
    lazy val triangles = LazyList.iterate((1, 0)) {
      case (n, sum) => (n + 1, sum + n) }.map(_._2)
  
    lazy val fibonacci : LazyList[Int] =
      0 #:: fibonacci.scanLeft(1)(_ + _)
  }
}