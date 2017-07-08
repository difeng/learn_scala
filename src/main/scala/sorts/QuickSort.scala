package sorts

/**
  * Created by difeng on 2017/7/6.
  * 快速排序
  */
object QuickSort {

  def quickSort[A <% Ordered[A]](list: List[A]): List[A] =  {
    list match {
      case Nil => List()
      case List() => List()
      case head::tail =>
        val (left, right) = tail.partition(_ < head)
        quickSort(left) ::: head :: quickSort(right)
    }
  }

  def main(args: Array[String]): Unit = {
//    import java.util.Random
//    val rand = new Random()
//    var list = List[Int]()
//    for (i <- 0 to 10000) {
//      list = rand.nextInt(10000) :: list
//    }
    val list = List(1,13,7,5,8,9,20,43,11,8)
    println(quickSort(list))
  }
}
