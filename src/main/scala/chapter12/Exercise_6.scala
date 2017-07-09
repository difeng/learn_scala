package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 修改前一个函数，返回最大的输出对应的输入。
  * 举例来说，largestAt(fun: (Int) => Int, inputs: Seq[Int])应该返回5。
  * 不得使用循环或递归
  */
object Exercise_6 extends App {
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = {
    inputs.toArray.map(x => (x, fun(x))).maxBy(_._2)._1
//    也可以这么写
//    inputs.toArray.map(x => (x, fun(x))).reduceLeft((a, b) => if (a._2 > b._2) a else b)._1
  }

  val ret = largestAt(x => 10 * x - x * x, 1 to 10)
  println(ret)
}
