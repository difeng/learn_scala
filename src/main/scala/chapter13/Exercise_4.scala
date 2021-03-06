package chapter13

/**
  * Created by difeng on 2017/7/13.
  * 编写一个函数，接受一个字符串的集合，以及一个从字符串到整数值的映射。
  * 返回整形的集合，其值为能和集合中某个字符串相对应的映射的值。举例来说，给定
  * Array("Tom","Fred","Harry")和Map("Tom" -> 3,"Dick" -> 4,"Harry" -> 5),
  * 返回Array(3, 5)
  * 提示：用flatMap将get返回的Option值组合在一起
  */
object Exercise_4 extends App {

  def f(arr: Array[String], map: Map[String, Int]): Array[Int] = {
    arr.flatMap(map.get(_))
  }

  println(f(Array("Tom","Fred","Harry"),Map("Tom" -> 3,"Dick" -> 4,"Harry" -> 5)).mkString(","))

}
