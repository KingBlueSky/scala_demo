package com.sudiyi.scala.control

import java.io.File

import scala.io.StdIn

/**
  * @author jbwang0106
  * create 2018-04-22 16:33
  **/
object Control {

  def main(args: Array[String]): Unit = {
    val fileName = if (!args.isEmpty) args(0) else "default.txt"
    println(fileName)
    println(gcbLoop(4, 8))

    /*var line = ""
    do {
      line = StdIn.readLine()
      println("Read: " + line)
    } while (line != null)*/

    val filesHere = (new File(".")).listFiles()
    for (fileName <- filesHere) {
      println(fileName)
    }

    for (i <- 0 to 4) {
      println(i)
    }

    for (i <- 0 until 4) {
      println(i)
    }

    //过滤filter
    val filesHeres = (new File(".")).listFiles()
    for (file <- filesHeres) {
      if (!file.getName().endsWith(".scala"))
      println(file + "------------")
    }

    ifEven(4)
  }

  def gcbLoop(x : Int, y : Int) : Int = {
    var a = x
    var b = y
    while (a != 0) {
      var temp = a
      a = a % b
      b = temp
    }
    b
  }

 def ifEven(n: Int): Unit = {
   val half =
     if (n % 2 == 0) n
     else
       throw new RuntimeException("n must be even")
 }
}
