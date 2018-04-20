package com.sudiyi.scala

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)
//    var list:Array[Int] = new Array[Int](2)
//    list(0) = 1
//    list(1) = 2

    for (x <- myList) {
      println(x)
    }

    //数组求和
    var total = 0.0
    for (i <- 0 to(myList.length - 1)) {
      total += myList(i)
    }

    println("总和为: " + total)

    //找到最大值
    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) {
        max = myList(i)
      }
    }

    println("最大值为：" + max)
  }
}

import Array._
object Test1 {
  def main(args: Array[String]): Unit = {
    var list1 = Array(1.9, 2.9, 3.4, 3.5)
    var list2 = Array(8.9, 7.9, 0.4, 1.5)
    var list3 = concat(list1, list2)
    for (x <- list3) {
      println(x)
    }
  }
}

import Array._

object Test2{
  def main(args: Array[String]): Unit = {
    var list1 = range(10, 20, 2)
    var list2 = range(10, 20)

    for (x <- list1) {
      print(" " + x)
    }

    println()

    for (x <- list2) {
      print(" " + x)
    }
  }
}
