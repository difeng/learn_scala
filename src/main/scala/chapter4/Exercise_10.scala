package chapter4

/**
  * Created by difeng on 2017/6/30.
  * 当你将两个字符串拉链在一起，比如"Hello".zip("World"),会是什么结果?相出一个讲得通用的用例
  */
object Exercise_10 {

  def main(args: Array[String]): Unit = {
    val zipStr = "Hello".zip("World")
    println(zipStr)
  }

}
