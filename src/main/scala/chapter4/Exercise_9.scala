package chapter4

/**
  * Created by difeng on 2017/6/30.
  * 编写一个函数lteqgt(values: Array[Int],v: Int),
  * 返回数组中小于v，等于v,大于v的数量，
  * 要求三个值一起返回
  */
object Exercise_9 {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4,5,6)
    println(lteqgt(arr,3))
    def lteqgt(values: Array[Int],v: Int) = {
      val lte = values.filter(x => x < v)
      val eq = values.filter(x => x == v)
      val gt = values.filter(x => x > v)
      (lte.length,eq.length,gt.length)
    }
  }
}
