package com.sudiyi.scala.control

import java.io.{FileNotFoundException, FileReader, IOException}
import java.net.{MalformedURLException, URL}

/**
  * @author jbwang0106
  **/
object ExceptionTest {

  def main(args: Array[String]): Unit = {
    /*try {
      var f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException =>
      case ex: IOException =>
    }*/

    val half =
      if (Integer.parseInt(args(0)) % 2 == 0) args(0)
    else
      throw new RuntimeException("args(0) must be even")

    println(half)

    urlFor("http://www.scalalang.org")
  }

  def urlFor(path: String) = {
    try {
      new URL(path)
    } catch {
      case ex :MalformedURLException =>
    } finally {
      new URL("http://www.baidu.com")
    }
  }
}
