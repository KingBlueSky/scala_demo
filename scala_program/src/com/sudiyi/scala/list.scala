package com.sudiyi.scala

object list {

  def main(args: Array[String]): Unit = {
    //函数不应该有副作用是函数式编程的一个重要理念
    //val oneTwoThree = List(1, 2, 3)

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    //将两个list组合成一个新个list
    val oneTwoThreeFour = oneTwo ::: threeFour

    println(oneTwo + " and " + threeFour + "were not mutated")
    println("thus, " + oneTwoThreeFour + " is a new List")

    val twoThree = List(2, 3)
    //把一个元素添加到一个list中，形成一个新的list
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)

    //将多个元素通过::操作符添加到Nil中，Nil是一个空对象
    val some = 1:: 2:: 3:: 4:: 5:: Nil
    println(some)
    println("-------------------------------------")
    listFunction()

  }

  /**
    * list常用方法的使用
    */
  def listFunction() = {

    val thrill = "Will":: "fill":: "until" :: Nil
    //返回索引为2的那个元素
    println(thrill(2))
    //计算元素的长度为4的元素的个数
    println(thrill.count(s => s.length == 4))
    //去掉前面2个元素的剩余元素列表
    println(thrill.drop(2))
    //去掉后面2个元素的剩余元素列表
    println(thrill.dropRight(2))
    //判断集合中是否存在元素until
    println(thrill.exists(s => s == "until"))
    //返回所有长度为4的元素组成的列表
    println(thrill.filter(s => s.length == 4))
    //判断列表中是元素是否都是以l结尾的
    println(thrill.forall(s => s.endsWith("l")))
    //遍历集合元素并打印
    thrill.foreach(print)
    println()
    thrill.foreach(s => print(s))
    println()
    //返回列表中的第一个元素
    println(thrill.head)
    //返回列表中除最后一个以外组成的新列表
    println(thrill.init)
    //判断列表是否为空
    println(thrill.isEmpty)
    //返回列表的最后一个元素
    println(thrill.last)
    //返回列表的长度
    println(thrill.length)
    //向列表的每个元素后面都追加一个字符
    println(thrill.map(s => s + "y"))
    //将列表连接成一个字符串
    println(thrill.mkString(","))
    //返回除元素的长度等于4以外的元素组成的列表,被filterNot方法取代
    println(thrill.filterNot(s => s.length == 4))
    //反转元素列表
    println(thrill.reverse)
    //将元素按照指定的规则排序并返回
    println(thrill.sortWith((s: String, t: String) => s.charAt(0).toLower < t.charAt(0).toLower))
    //返回除第一个元素以外的元素列表
    println(thrill.tail)
  }
}
