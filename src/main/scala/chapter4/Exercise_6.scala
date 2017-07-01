package chapter4

import java.util.Calendar
import scala.collection.mutable
/**
  * Created by difeng on 2017/6/30.
  * 定义一个链式哈希映射，将“Monday”映射到java.util.Calendar.MONDAY,依次类推加入其它日期。
  * 展示元素是以插入的顺序被访问的
  */
object Exercise_6 {
  def main(args: Array[String]): Unit = {
    var linkedMap = new mutable.LinkedHashMap[String,Int]
    linkedMap += ("Monday" -> Calendar.MONDAY)
    linkedMap += ("Tuesday" -> Calendar.TUESDAY)
    linkedMap += ("Thursday" -> Calendar.THURSDAY)
    linkedMap += ("Wednesday" -> Calendar.WEDNESDAY)
    linkedMap += ("Friday" -> Calendar.FRIDAY)
    linkedMap += ("Saturday" -> Calendar.SATURDAY)
    linkedMap += ("Sunday" -> Calendar.SUNDAY)
    linkedMap.foreach(println)
  }
}
