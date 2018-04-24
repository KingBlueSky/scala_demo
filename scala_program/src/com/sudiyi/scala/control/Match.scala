package com.sudiyi.scala.control

/**
  * @author jbwang0106
  **/
object Match {
  def main(args: Array[String]): Unit = {
    val firstArg = if (args.length > 0) args(0) else ""

    /*firstArg match {
      case
        "salt" => println("peper")
      case
        "chips" => println("salsa")
      case
        "eggs" => println("bacon")
      case
        _ => println("huh?")
    }*/

    val friend =
      firstArg match {
        case "salt" => "peper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => "huh?"
      }

    println(friend)
  }
}
