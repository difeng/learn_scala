package chapter18

import scala.collection.mutable

/**
  * Created By difeng on 2017/11/14
  */
object chapter18 extends App {

  class A {

    class B(val b: String) {

    }
  }

  val a1: A = new A()
  val a2: A = new A()

  var a1b = new a1.B("H")
  a1b = new a1.B("H")
//  a1b = new a2.B("H")

  type Index = mutable.HashMap[String, (Int, Int)]

  abstract class Reader {
    type Contents
    def read(fileName: String): Contents
  }

  def appendLines(target: {def append(str: String): Any}, lines: mutable.Iterable[String]): Unit = {
    for (l <- lines) {
      target.append(l);
      target.append("\n")
    }
  }

  def sendMessage(toUser: {def add(user: String): List[String]}, msg: String): Unit = {
    toUser.add(msg)
  }

  trait Ta
  trait Tb
  trait Tc

  trait TD extends Tb with Tc with Ta


  val p: String Map Int = Map("Hello" -> 1)
  println(p)


}
