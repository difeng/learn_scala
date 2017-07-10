package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 得到一个对偶很容易，比如：
  * val pairs = (1 to 10) zip (11 to 20)
  * 假定你想要对这个序列做某种操作——比如，给对偶中的数求和。
  * 但你不能直接用:
  * pairs.map(_ + _)
  * 函数_ + _接受两个Int作为参数，而不是(Int,Int)对偶。编写函数
  * adjustToPair，该函数接受一个类型为(Int, Int) => Int的函数作为参数，并返回
  * 一个等效的、可以以对偶作为参数的函数。举例来说就是：adjustToPair(_ * _)((6,7))应
  * 得到42
  */
object Exercise_7 extends App {

  def adjustToPair(fun: (Int,Int) => Int) = (x: (Int, Int)) => fun(x._1, x._2)

  println(adjustToPair(_ * _)((6,7)))

  val pairs = (1 to 10) zip (11 to 20)

  println(pairs.map(adjustToPair(_ + _)))

}
