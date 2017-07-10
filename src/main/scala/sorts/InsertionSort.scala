package sorts

import scala.annotation.tailrec

/**
  * Created by difeng on 2017/7/9.
  * Insertion sort
  */
object InsertionSort extends App {

  def insertionSort[A <% Ordered[A]](list: List[A]): List[A] = {
    @tailrec def sort(as: List[A], bs: List[A]): List[A] = as match {
      case ha :: ta => sort(ta, insert(ha, bs))
      case Nil => bs
    }

    def insert(a: A, as: List[A]): List[A] = {
      as match {
        case ha :: ta if (a > ha) => ha :: insert(a, ta)
        case _ => a :: as
      }
    }

    sort(list, Nil)
  }

  import java.util.Random
  val rand = new Random()
  var list = List[Int]()
  for (i <- 0 to 10000) {
    list = rand.nextInt(10000) :: list
  }
//  val list = List(1,13,7,5,8,9,20,43,11,8)
  println(insertionSort(list).mkString(","))

}
