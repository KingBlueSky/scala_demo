object list {

  val a = List(1, 2, 3)
  a.filter(x => x % 2 == 1)

  val c = "99 Red Balloons".toList
  c.filter(x => Character.isDigit(x))

  c.takeWhile(x => x != 'B')

  val b = List("x", "y", "z")
  b.map(x => x.toUpperCase)

  b.map(_.toLowerCase)

  a.filter(_ % 2 == 1)

  a.filter(_ % 2 == 1).map(_ + 10)

  val q = List(a, List(4, 5, 6))

  q.map(x => x.filter(_ % 2 == 0))

  q.map(_.filter(_ % 2 == 0))

  q.flatMap(_.filter(_ % 2 == 0))


  a.reduceLeft((x, y) => x + y)
  a.reduce(_ + _)


  1 to 10
  1 to 10 by 2
  val d = (1 to 10).toList

  println(d)

  println((1 until 10).toList)

  val tuple1 = (1, 2)

  val tuple2 = (1, "Alice", 95.5)

  tuple1.toString()

  tuple2._3

  def sumSq(in: List[Int]): (Int, Int, Int) = {
    in.foldLeft((0, 0, 0))((t, v) => (t._1 + 1, t._2 + v, t._3 + v * v))
  }

  sumSq(a)


}