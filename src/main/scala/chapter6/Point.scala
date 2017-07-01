package chapter6

/**
  * Created by duyongfeng@creditzx.com on 2017/6/27.
  */
class Point(var x: Float,var y: Float) {

  override def toString = s"Point($x, $y)"
}

object Point {

  def apply(x: Float,y: Float): Point = new Point(x, y)

  def main(args: Array[String]): Unit = {
    println(new Point(3,4))
    println(Point(3,4))
  }

}
