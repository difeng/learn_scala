package chapter13

import scala.collection.{SortedSet, mutable}
import scala.collection.mutable.ListBuffer
import scala.collection.immutable

/**
  * Created by difeng on 2017/7/13.
  */
object Exercise_2 extends App {

  def indexs(str: String) = str.zip(0 to str.length).groupBy(_._1).mapValues(_.map(_._2))

  def indexs1(str: String) = {
    var map = new immutable.HashMap[Char, ListBuffer[Int]]()
    str.zip(0 to str.length).foreach(x => {
      map.get(x._1) match {
        case Some(y) => y += x._2
        case None => map += (x._1 -> ListBuffer(x._2))
      }
    })
    map
  }

  println(indexs("Mississippi"))
  println(indexs1("Mississippi"))
}
