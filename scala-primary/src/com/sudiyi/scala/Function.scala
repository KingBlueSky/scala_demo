package com.sudiyi.scala

object Function {
  def main(args: Array[String]): Unit = {
    println(multiplier(1))
    println(multiplier(2))
    //println("Returned Value : " + addInt(5, 7))
  }

  def addInt(a:Int, b:Int) : Int = {

    var sum = 0
    sum = a + b

    return sum
  }

  var factor = 3
  var multiplier = (i : Int) => i * factor
}
