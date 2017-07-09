package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 编写函数largest(fun: (Int) => Int, inputs: Seq[Int]),
  * 输出在给定输入序列中给定函数的最大值。举例来说, largest(x => 10 * x - x*x, 1 to 10)
  * 应该返回25。不得使用循环和递归。
  */
object Exercise_5 extends App {

  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = {
//    也可以这样写
//    inputs.toArray.map(fun).reduceLeft((a, b) => if (a < b) b else a)
    inputs.toArray.map(fun).max
  }

  val ret = largest(x => 10 * x - x*x, 1 to 10)
  println(ret)
}
