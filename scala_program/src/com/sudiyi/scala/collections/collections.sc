//创建一个List
val numbers = List(1, 2, 3, 4 ,5)

//存放不同类型元素的list
val list = List(2, "2", List(1, 2))

//使用Nil连接各个元素形成一个List
val list1 = 1 :: 2 :: 3 :: 4 :: Nil

//也可以把Nil放在前面，如下,只能连接一个元素
val list2 = Nil.::(1) // 1 :: 2 :: 3 :: 4

//使用to方法创建list
val list3 = 10 to 20 toList

//获取头部元素
list3.head
//获取尾部元素
list3.tail
//获取指定下标的元素,从0下标
list3(1)

//遍历集合元素的多种方式
var total = 0

for (i <- list3) {
  total += i
}

println(total)

list3.foreach((c: Int) => println(c))

//对集合进行map操作
list3.map((c: Int) => println(c + 1))

//进行reduce操作
list3.reduce((a: Int, b: Int) => a + b)


//set中的元素不允许重复，其他的操作就跟list一样了

//创建一个map
val map = Map("red" -> "0xff", "green" -> "0xff00", "blue" -> "0xff00")

//根据key获取value
val red = map("red")

//判断是否存在指定的key
val white = map.contains("white")

//遍历map的几种方式
for (pairs <- map) {
  println(pairs)
}

for (key <- map.keys) {
  val value = map(key);
  println(key + "=>" +value)
}

for (value <- map.values) {
  println(value)
}

//创建可变的map
var map1 = scala.collection.mutable.Map[String, Int](
  "zhangsan" -> 27,
  "lisi" -> 28
)

//map中追加键值对
map1 += ("wangwu" -> 22, "zhaoliu" -> 21)
//删除键值对
map1 -= ("lisi")

//根据key获取值，不存在则默认一个
map1.getOrElse("lisi", 23)

//m模式匹配
def getAge(name: String): Unit = {
  val age = map1.get(name)
  age match {
    case Some(age) => println(age)
    case None => println("none")
  }
}

getAge("lisi")










