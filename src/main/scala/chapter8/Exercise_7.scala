package chapter8

import java.awt.Point

/**
  * Created by difeng on 2017/7/2.
  * 提供一个Square类，扩展自java.awt.Rectangle并且有三个构造器:
  * 一个以给定的端点和宽度构造正方形，一个以(0,0)为端点和给定的宽度
  * 构造正方形，一个以(0,0)为端点、0为宽度构造正方形
  */
object Exercise_7 {

  class Square(point: Point,w: Double) extends java.awt.Rectangle {

    def this(w: Double) = { this(new Point(0,0),w)}

    def this() = { this(new Point(0,0),0)}

    override def toString: String = s"Point(${point.x},${point.y}),w:$w"
  }

  def main(args: Array[String]): Unit = {
    val s1 = new Square(new Point(1,2),1)
    val s2 = new Square(1)
    val s3 = new Square()
    println(s1)
    println(s2)
    println(s3)
  }
}
