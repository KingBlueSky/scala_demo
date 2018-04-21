package com.sudiyi.scala.classandobejct

object TestClass {

  def main(args: Array[String]): Unit = {
    val acc = new ChecksumAccumulator()
    acc.sum = 3
    println(acc.sum)
    println(acc.getAvg())
    //无法改变val变量的指向
    //acc = new ChecksumAccumulator()

    import com.sudiyi.scala.classandobejct.ChecksumAccumulator.calculate

    for (arg <- args) {
      println(arg + ": " + calculate(arg))
    }

  }
}

