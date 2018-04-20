package com.sudiyi.scala

/**
  * private修饰的变量只能在本类中进行访问，
  * 内部类中变量在外部类中也无法进行访问
  */
class Outer {

  class Inner {
    private def f(): Unit = {
      println("f")
    }
  }

}

/**
  * protected修饰的变量只能在本类和子类中进行访问，
  * 本包中的其他类也无法访问
  */
package p {

  class Super {

    protected def f(): Unit = {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    //f()
  }


}
