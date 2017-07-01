package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 定义一个扩展自java.awt.Point的Origin对象。
  * 为什么说这实际上不是个好主意（仔细看Point类的方法）
  */
object Exercise_3 {

  def main(args: Array[String]): Unit = {
    object origin extends java.awt.Point {

    }
    println(origin)
  }
}
