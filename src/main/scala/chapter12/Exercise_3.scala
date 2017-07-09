package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 用to和reduceLeft实现阶乘函数，不得使用循环和递归
  */
object Exercise_3 extends App {

  def factorial(n: Int): Int =
    if (n < 1)
      return 1
    else
      (1 to n).reduceLeft(_ * _)

  println(factorial(-5))
  println(factorial(5))
}
