import java.math.BigInteger

object first {

  //默认会使用res0进行接收，一般在:后面跟上变量的类型
  1 + 2

  println("Hello World")

  //定义常量
  val msg = "Hello World"
  //msg = "12" 不允许的操作

  //定义变量
  var msg1 = "12345"
  msg1 = "google" //可以更改变量的值

  //定义一个函数
  def max (x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  max(3, 4)

  def max1(x: Int, y:Int) = if (x > y) x else y

  def greet() = println("Hello, World")

  greet()

  val big = new BigInteger("12345")


}