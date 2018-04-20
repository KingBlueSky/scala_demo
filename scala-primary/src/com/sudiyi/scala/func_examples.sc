object func_examples {
  def hello(name: String) : String = {
    s"Hello, ${name}"
  }

  hello("jiangbo")

  def hello2(name: String) = {
    s"hello, ${name}"
  }

  hello2("jbo")

  def add(x: Int, y: Int) = {
    x + y
  }

  add(1, 2)

  val list = List("alice", "bob", "cathy")

  //打印集合中的全部元素
  for (s <- list) println(s)

  // 打印符合条件的结果
  for {
    s <- list
    if (s.length > 3)
  } println(s)

  //变量绑定
  val result_for = for {
    s <- list
    s1 = s.toUpperCase()
    if (s1 != "")
  } yield (s1)


  val result_try = try {
    Integer.parseInt("dog")
  } catch {
    case _ => 0
  } finally {
    println("always be printed")
  }


  val code = 2
  var result_match = code match {
    case 1 => "one"
    case 2 => "two"
    case _ => "others"
  }

  def bar(x: Int, y: => Int): Int = 1


  (x: Int, y: Int) => x + y


  def curriedAdd(a: Int)(b: Int) = a + b

  curriedAdd(2)(2)

  val addOne = curriedAdd(1)_
  addOne(2)


}