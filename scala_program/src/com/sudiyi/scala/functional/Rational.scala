package com.sudiyi.scala.functional

/**
  * 分数对象
  * 在创建类的时候，在类名后面传入的参数成为类参数
  */
class Rational(n : Int, d : Int) {

  /**
    * 默认在创建对象之前调用，返回true则正常创建对象
    * 返回false则不能创建对象，会抛出IllegalArgumentException
    */
  require(d != 0)

  /**
    * 最大公约数
    */
  private val g : Int = gcb(n.abs, d abs)

  /**
    * 分子
    */
  val number : Int = n / g
  /**
    * 分母
    */
  val denom : Int = d / g

  /**
    * 从构造器
    * @param n
    * @return
    */
  def this(n : Int) = this(n, 1)

  override def toString : String = "rational: " + number + "/" + denom

  /**
    * 实现两个分数的相加
    * @param that
    * @return 一个新的分数
    */
  def +(that: Rational) : Rational = {
    new Rational(number * that.denom + that.number * denom, denom * that.denom)
  }

  def * (that: Rational) : Rational = {
    new Rational(number * that.number, denom * that.denom)
  }

  /**
    * 计算啊a,b的最大公约数
    * @param a
    * @param b
    * @return 返回a,b的最大公约数
    */
  private def gcb(a : Int, b : Int) : Int = {
    if (b == 0) a else gcb(b, a % b)
  }
}

object Rational {

  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    println(oneHalf + twoThirds)
    println(oneHalf * twoThirds)

    println(new Rational(66, 42))
    implicit def intToRational(x: Int) = new Rational(x)
    println(2 * oneHalf)
  }

}
