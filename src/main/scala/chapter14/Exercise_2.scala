package chapter14

/**
  * Created by difeng on 2017/7/16.
  * 利用模式匹配，编写一个swap函数，接受一个整数的对偶，返回对偶的两个组成部件互换位置的新对偶
  */
object Exercise_2 extends App {

  def swap(a: (Int, Int)): (Int, Int) = a match {
    case (a1, a2) => (a2, a1)
  }

  println(swap(1, 2))

}
