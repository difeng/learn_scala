package chapter13
import java.util

import scala.collection.JavaConversions._
import scala.collection.mutable.ArrayBuffer
/**
  * Created by difeng on 2017/7/12.
  * 所有集合都扩展自Iterable特质
  * 集合有三大类，分别为序列、集、和映射
  * 对于几乎所有集合类，Scala都提供了可变的和不可变的版本
  * Scala列表要么是空的，要么拥有一头一尾，其中尾部本身又是一个列表
  * 集是无先后次序的集合
  * 用LinkedHashSet来保留插入顺序，或者用SortedSet来按顺序进行迭代
  * +将元素添加到无先后次序的集合中；+:和:+向前或者向后追加到序列；++将两个集合串接在一起；-和--移除元素
  * Iterable和Seq特质有数十个用于常见操作的方法。在编写冗长繁琐的循环之前，先看看这些方法是否满足你的需要
  * 映射、折叠和拉链操作是很有用的技巧，用来将函数或操作应用到集合中的元素。
  */
object chapter13 extends App {

  val props: scala.collection.mutable.Map[String,String] = System.getProperties()
  println(props)

  val jul: java.util.List[Int] = ArrayBuffer(1, 2, 3)
  println(jul)

  val jset: java.util.Set[Int] = Set(1,2,3)
  println(jset)

  val jnum: java.util.Enumeration[Int] = Iterator(1,2,3)

  println(jnum)

  /**
    * 线程安全的集合
    * SynchronizedBuffer
    * SynchronizedMap
    * SynchronizedPriorityQueue
    * SynchronizedQueue
    * SynchronizedSet
    * SynchronizedStack
    *
    */
  import scala.collection.mutable
  val scores = new mutable.HashMap[String,Int] with mutable.SynchronizedMap[String, Int]

  //并行集合
  /*
    对集合使用par方法，par方法返回的并行集合的类型扩展自ParSeq、ParSet或ParMap特质类型，所有这些特质都是ParIterable的子类型。
    不能将并行集合传递给预期的Iterable、Seq、Set或Map方法。你可以用set方法将并行集合转换回串行的版本，也可以实现接收通用的
    GenIterable、GenSeq、GenSet或GenMap类型的参数的方法
   */

}
