package sorts

/**
  * Created by difeng on 2017/7/6.
  * 冒泡排序
  */
object BubbleSort {

  def sort(list: List[Int]): List[Int] = {
    def compareExchage(data: Int,dataList: List[Int]): List[Int] = {
      dataList match {
        case List() =>  List(data)
        case head :: tail => {
          if (data < head)
            data :: dataList
          else
            head :: compareExchage(data,tail)
        }
      }
    }
    list match {
      case List() => List()
      case head :: tail => compareExchage(head,sort(tail))
    }

  }



  def main(args: Array[String]): Unit = {
//    import java.util.Random
//    val rand = new Random()
//    var list = List[Int]()
//    for (i <- 0 to 100) {
//      list = rand.nextInt(10000) :: list
//    }
    val list = List(1,13,7,5,8,9,20,43,11,8)
    println(sort(list))
  }
}
