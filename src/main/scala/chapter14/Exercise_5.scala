package chapter14

/**
  * Created by difeng on 2017/7/18.
  */
object Exercise_5 extends App {

  def leafSum(tree: List[Any]): Int = {
    var sum = 0
    tree.foreach(x => x match {
      case a: List[Any] => sum += leafSum(a)
      case a: Int => sum += a
    })
    sum
  }

  println(leafSum(List(List(3, 8), 2, List(5))))


}
