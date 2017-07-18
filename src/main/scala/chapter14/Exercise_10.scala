package chapter14
import scala.math._
/**
  * Created by difeng on 2017/7/18.
  *
  */
object Exercise_10 extends App {

  def compose(f: Double => Option[Double], g: Double => Option[Double]): Double => Option[Double] = {
    (x: Double) => {
      if (f(x) == None || g(x) == None)
        None
      else  f(g(x).get)
    }
  }

  def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None

  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  val h = compose(f, g)

  println(h(2))
  println(h(1))
  println(h(0))
}
