package chapter13

import scala.collection.{SortedSet, mutable}

/**
  * Created by difeng on 2017/7/13.
  * 编写一个函数，给定字符串，产出一个包含所有字符的下标的映射。举例来说，indexs("Mississippi")
  * 应返回一个映射，让'M'对应集{0},'i'对应集{1,4,7,10},依次类推。使用字符到可变集的映射。另外，
  * 你如何保证集是经过排序的
  */
object Exercise_1 extends App {

  //最简洁的实现
  def indexs(str: String): Map[Char, Set[Int]] = str.zip(0 to str.length).groupBy(_._1).mapValues(_.map(_._2) toSet)

  def indexs1(str: String) = {
    var map = new mutable.HashMap[Char, SortedSet[Int]]()
    str.zip(0 to str.length).foreach(x => {
      map.get(x._1) match {
        case Some(y) => map(x._1) = y + x._2
        case None => map.put(x._1,SortedSet(x._2))
      }
    })
    map
  }

  println(indexs("Mississippi"))
  println(indexs1("Mississippi"))

}
