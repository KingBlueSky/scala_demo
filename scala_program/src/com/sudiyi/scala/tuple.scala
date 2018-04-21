package com.sudiyi.scala

object tuple {

  def main(args: Array[String]): Unit = {
    //1. 创建元组并访问其中的元素
    val pair = (99, "Luftball")
    println(pair._1)
    println(pair._2)
  }

}
