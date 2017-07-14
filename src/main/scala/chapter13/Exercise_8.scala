package chapter13

/**
  * Created by difeng on 2017/7/14.
  * 编写一个函数，将Double数组转换成二位数组。传入列数作为参数。举例来说，Array(1, 2, 3, 4, 5, 6)和三列，
  * 返回Array(Array(1, 2, 3),Array(4, 5, 6))。用grouped方法。
  */
object Exercise_8 extends App {

  def matrixArray(arr: Array[Int],cols: Int): Array[Array[Int]] = {
    arr.grouped(cols).toArray
  }

  println(matrixArray(Array(1, 2, 3, 4, 5, 6), 3))
}
