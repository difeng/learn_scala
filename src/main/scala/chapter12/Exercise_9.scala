package chapter12

/**
  * Created by difeng on 2017/7/10.
  * 不使用柯里化实现corresponds。然后尝试从前一个练习的代码来调用。你遇到了什么问题？
  */
object Exercise_9 extends App {

  def corresponds(a: Array[String], b: Array[Int],f: (String, Int) => Boolean): Boolean  = {
    (a zip b).map(x => f(x._1, x._2)).reduce(_ & _)
  }
  val a = Array("Hello", "World" ,"code")
  val b = Array(5, 5, 4)
  val c = Array(5, 5, 3)
  println(corresponds(a, b, (x, y) => x.length==y))
  println(corresponds(a, c, (x, y) => x.length==y))
}
