package chapter8

/**
  * Created by difeng on 2017/7/2.
  * 6.定义一个抽象Shape、一个抽象方法centerPoint，以及该抽象类的子类Rectangle和Circle。
  * 为子类提供合适的构造器，并重写centerPoint方法。
  */
object Exercise_6 {

  abstract class Shape {
    def centerPoint
  }

  class Rectangle(x: Double,y: Double) extends Shape {

    def centerPoint: Unit= {

    }

  }
}
