package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 如何用reduceLeft得到数组中的最大元素
  */
object Exercise_2 extends App {

  val arr = Array(1,5,7,55,3,23)
  println(arr.reduceLeft((a, b) => if (a > b) a else b))

}
