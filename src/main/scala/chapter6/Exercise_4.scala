package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 定义一个Point类和一个伴生对象，使得我们可以不用new而直接用Point(3,4)来构造Point实例
  */
object Exercise_4 {

  class Origin extends java.awt.Point {}

  object Origin extends java.awt.Point {
    def apply: Origin = new Origin()
  }

  def main(args: Array[String]): Unit = {
    println(Origin)
  }

}
