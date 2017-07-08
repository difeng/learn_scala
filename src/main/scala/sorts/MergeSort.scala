package sorts

/**
  * Created by difeng on 2017/7/8.
  * 归并排序
  */
object MergeSort extends App {

  def mergeSort[A <% Ordered[A]](data: List[A]): List[A] = {
    def sort(p: (List[A], List[A])): List[A] = {
      p match {
        case (Nil, Nil) => Nil
        case (a :: Nil, Nil) => a :: Nil
        case (Nil, a :: Nil) => a :: Nil
        case (as, bs) => merge(splitIn2AndSort(as), splitIn2AndSort(bs))
      }
    }

    def splitIn2AndSort(as: List[A]): List[A] = {
      sort(splitIn2(as))
    }

    def merge(as: List[A], bs: List[A]): List[A] = {
      def loop(cs: List[A], ds: List[A], rs: List[A]): List[A] = (cs, ds) match {
        case (Nil, Nil) => rs
        case (hc :: tc, hd :: td) =>
          if (hc < hd)
            loop(tc, ds, hc :: rs)
          else
            loop(td, cs, hd :: rs)
        case (hc :: tc, Nil) => loop(tc, Nil, hc :: rs)
        case (Nil, hd :: td) => loop(Nil, td, hd :: rs)
      }
      loop(as, bs, Nil).reverse
    }

    def splitIn2(as: List[A]): (List[A], List[A]) = {
      val mid = as.length / 2
      (as.slice(0, mid), as.slice(mid, as.length))
    }
    splitIn2AndSort(data)
  }

  val list = List(1,13,7,5,8,9,20,43,11,8)
  println(mergeSort(list).mkString(","))
}
