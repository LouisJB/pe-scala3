object LazyNumberSeqs {
  val triangles = LazyList.iterate((1, 0)) {
    case (n, sum) => (n + 1, sum + n) }.map(_._2)
}
