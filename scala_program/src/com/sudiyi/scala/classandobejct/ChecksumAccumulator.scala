package com.sudiyi.scala.classandobejct

class ChecksumAccumulator {
  var sum = 0
  private var avg = 12

  def getAvg(): Int = {
    return avg
  }

  def add(b: Byte) = {
    avg += b
  }

  def checkAvg(): Int = {
    return ~(avg & 0xFF) + 1
  }
}

import scala.collection.mutable.Map

object ChecksumAccumulator {
  private val cache = Map[String, Int]()

  def calculate(s: String) = {
    if (cache.contains(s)) {
      cache(s)
    } else {
      val acc = new ChecksumAccumulator
      for (c <- s) {
        acc.add(c.toByte)
      }
      val cs = acc.checkAvg()
      cache += (s -> cs)
      cs
    }
  }


}
