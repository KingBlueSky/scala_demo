package com.sudiyi.scala

import scala.collection.immutable.HashSet

object setAndmap {
  def main(args: Array[String]): Unit = {
    //默认创建的是不可变集
    var jetset = Set("A", "B")
    jetset += "L"
    println(jetset)

    //引入的包不一定放在最上面
    import scala.collection.mutable.Set
    //创建可变集
    var moveSet = Set("H", "P")
    moveSet += "S"
    println(moveSet)

    val hashSet = HashSet("Tomcatoes", "Chilies")
    println(hashSet + "Cor")

    val romap = Map(1->"1", 2->"2", 3->"3")
    println(romap(3))

    import scala.collection.mutable.Map

    val map = Map[Int, String]()
    map += (1 -> "go to island")
    map += (2 -> "Find big X on ground.")
    map += (3 -> "Dig.")
    println(map(2))
  }
}
