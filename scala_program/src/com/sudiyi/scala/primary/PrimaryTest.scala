package com.sudiyi.scala.primary

/**
  * @author jbwang0106@163.com
  * 在scala中，有关操作符的操作在底层都是使用的方法调用
  * 比如常用的+，-，*，/，%等等
  * 它包括前缀，中缀，后缀三种操作符
  */
object PrimaryTest {

  def main(args: Array[String]): Unit = {
    println("""|Welcome to Ult 3000.
               |TYPE 'HELP' for help""".stripMargin)

    val s = "Hello, World"
    println(s toLowerCase)
  }
}
