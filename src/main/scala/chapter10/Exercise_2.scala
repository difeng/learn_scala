package chapter10

import scala.math.Ordered
import java.awt.Point
import scala.util.Sorting

/**
  * Created by difeng on 2017/7/4.
  */
object Exercise_2 extends App {


  class OrderedPoint(x: Int,y: Int) extends Point(x,y) with Ordered[OrderedPoint] {

    override def compare(that: OrderedPoint): Int = {
      if (this.x <= that.x && this.y < that.y) -1
      else if (this.x == that.x && this.y == that.y ) 0
      else 1
    }

  }

  val p1 = new OrderedPoint(1,2)
  val p2 = new OrderedPoint(1,2)
  val p3 = new OrderedPoint(1,3)
  val p4 = new OrderedPoint(1,1)

  val arr = Array(p1,p2,p3,p4)

  Sorting.quickSort(arr)

  arr.foreach(println)
}
