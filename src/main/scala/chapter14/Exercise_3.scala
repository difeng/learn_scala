package chapter14

/**
  * Created by difeng on 2017/7/16.
  */
object Exercise_3 extends App {


  def swapFirstElements(arr: Array[Any]): Array[Any] = arr match {
    case Array(h1, h2, t @_*) => Array(h2, h1)++t
    case _ => arr
  }

  println(swapFirstElements(Array(1, 2, 3, 4)).mkString(","))

}
