package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 前一个实现需要处理一个特殊情况，即n < 1的情况。
  * 展示如何使用foldLeft来避免这个需要
  */
object Exercise_4 extends App {

  def factorial(n: Int): Int = (1 to n).foldLeft(1)(_ * _)

  println(factorial(-5))
  println(factorial(5))

}
