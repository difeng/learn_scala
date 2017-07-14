package chapter13

import java.util
import javax.swing.JToolBar.Separator

/**
  * Created by difeng on 2017/7/14.
  * 实现一个函数，作用与mkString相同，使用reduceLeft
  */
object Exercise_5 extends App {

  def mkString(list: List[Int], separator: String): String = {
    list.map(_.toString).reduceLeft(_ + separator + _)
  }


//  trait MkStr {
//     this: scala.collection.Iterator[String] =>
//     def mkStr(sp: String) = if(this != Nil) this.map(_.toString).reduceLeft(_ + sp + _)
//  }

  trait MkStr {
    self: scala.collection.mutable.Iterable[String] =>
    def mkStr(op: String) = if (self != Nil) self.reduceLeft(_.toString + op +  _.toString)
  }

  val list = new scala.collection.mutable.ArrayBuffer[String]() with MkStr

  list += "1"
  list += "2"
  list += "3"

  println(list.mkStr(","))
}
