package sorts

import scala.annotation.tailrec

/**
  * Created by difeng on 2017/7/9.
  * Selection sort
  */
object SelectionSort extends App {

  def selectionSort[A <% Ordered[A]](list: List[A]): List[A] = {

    def sort(as: List[A], bs: List[A]): List[A] = {
      as match {
        case h :: t => select(as, Nil, bs)
        case Nil => bs
      }
    }

    @tailrec def select(as: List[A], bs: List[A], rs: List[A]): List[A] =
      as match {
        case h :: m :: t =>
          if (h < m)
            select(m :: t, h :: bs, rs)
          else
            select(h :: t, m :: bs, rs)
        case h :: Nil => sort(bs, h :: rs)
        case Nil => sort(bs, rs)
      }
    sort(list, Nil)
  }

  val list = List(1, 13, 7, 5, 8, 9, 20, 43, 11, 8)
  println(selectionSort(list))
}
