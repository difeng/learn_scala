package chapter10
import java.awt.geom.Ellipse2D

/**
  * Created by difeng on 2017/7/4.
  */
object Exercise_1 extends App {

  trait RectangleLike {
    this: Ellipse2D.Double =>
    def translate(x : Double, y : Double): Unit = {
      this.x = x
      this.y = y
    }

    def grow(x: Double, y: Double): Unit = {
      this.x += x
      this.y += y
    }
  }

  val egg = new Ellipse2D.Double(5,10,20,30) with RectangleLike

  egg.translate(10, -10)
  egg.grow(10, 20)
}
