package chapter14

/**
  * Created by difeng on 2017/7/18.
  */
object Exercise_9 extends App {

  def listSum(list: List[Option[Int]]): Int = {
    var sum = 0
    for(item <- list) sum += item.getOrElse(0)
    sum
  }

  println(listSum(List(Some(1), Some(2), Some(3), Some(4), None)))
}
