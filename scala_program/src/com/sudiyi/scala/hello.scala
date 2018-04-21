package com.sudiyi.scala

object hello {

  def main(args: Array[String]): Unit = {
    //使用while循环
    var i = 0
    while (i < args.length) {
      if (i != 0) {
        print(" ")
      }
      print(args(i))
      i += 1
    }
    println()

    args.foreach(arg => println(arg))

  }
}
