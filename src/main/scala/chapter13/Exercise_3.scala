package chapter13

/**
  * Created by difeng on 2017/7/13.
  * 编写一个函数，从一个整型链表中去除所有零值
  */
object Exercise_3 extends App {

  def dropZeros(list: List[Int]): List[Int] = {
    list.filter(_ != 0)
  }

  println(dropZeros(List(1,0,3,19,5,2,0)))
}
