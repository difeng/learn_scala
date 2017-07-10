package chapter12

/**
  * Created by difeng on 2017/7/10.
  *
  */
object Exercise_8 extends App {

  val a = Array("Hello", "World" ,"code")
  val b = Array(5, 5, 4)
  val c = Array(5, 5, 3)
  println(a.corresponds(b)(_.length == _))
  println(a.corresponds(c)(_.length == _))

}
