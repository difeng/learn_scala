package chapter13

/**
  * Created by difeng on 2017/7/14.
  * 在13.11节中，表达式(prices zip quantities) map { p => p._1 * p._2}有些不够优雅。
  * 我们不能用(pricees zip quantities) map { _ * _ },因为_ * _ 是一个带两个参数的函数，
  * 而我们需要的是一个带单个类型的元组的参数的函数，Function对象的tupled方法可以将带两个参数的函数
  * 改为以元组为参数的函数，将tupled应用于乘法函数，以便我们可以用它来映射有对偶组成的列表。
  */
object Exercise_7 extends App {
  val prices = List(5, 2, 9)
  val quantities = List(10, 2, 1)
  val ret = (prices zip quantities) map {Function.tupled(_ * _)}
  println(ret)

}
