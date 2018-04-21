package com.sudiyi.scala

object parameterize {

  def main(args: Array[String]): Unit = {
    //定义一个数组为string的变量，它的长度初始化为3
    val greeting = new Array[String](3)

    //给每一个位置的数组赋值，使用小括号来访问数组指定位置的数据
    greeting(0) = "Hello"
    greeting(1) = ","
    greeting(2) = "World\n"

    //i的取值是0到2
    for (i <- 0 to 2) {
      print(greeting(i))
    }

    //上述操作的底层是这样进行转换的
    greeting.update(0, "google")
    greeting.update(1, ",")
    greeting.update(2, "beat\n")

    for (i <- 0 to 2) {
      print(greeting.apply(i))
    }

    //创建数组的同时进行赋值，可以省略new关键字
    val numNames = Array("zero", "one", "two")


  }
}
