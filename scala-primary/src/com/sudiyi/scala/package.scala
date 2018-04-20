package com.sudiyi

object Test {

  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    var c = 25
    println("a + b = " + (a + b))
    println("a - b = " + (a - b))
    println("a * b = " + (a * b))
    println("b / a = " + (b / a))
    println("b % a = " + (b % a))
    println("c % a = " + (c % a))

    if(a < 20) {
      println("x < 20")
    }
  }
}

object add {
  def addInt(a:Int, b:Int) : Int = {
    var sum = 0
    sum = a + b
    return sum
  }
}

object Hello {
  def printMe():Unit = {
    println("hello scala")
  }
}