package chapter4

/**
  * Created by difeng on 2017/6/30.
  * 编写一个函数minmax(values: Array[Int]),返回数组中最小值和最大值的对偶
  */
object Exercise_8 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5,6)
    println(minmax(arr))
    def minmax(values: Array[Int]) = {
      (values.min,values.max)
    }
  }
}
