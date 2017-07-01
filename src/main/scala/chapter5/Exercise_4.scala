package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 重新实现前一个练习中的Timer类，将其内部呈现改成自午夜起的分钟数(介于0到24 * 60 - 1之间).
  * 不要改变公有接口。也就是说，客户端代码不应因你的修改而受到影响
  */
object Exercise_4 {

  def main(args: Array[String]): Unit = {

    class Time (val hours: Int,val minutes: Int) {

      def before(other: Time): Boolean = {
        if (other.hours < hours) true
        else if (other.hours == hours) other.minutes < minutes
        else false
      }

      override def toString: String = "minutes:" + hours * 60  + minutes

    }
    val t1 = new Time(12,1)
    val t2 = new Time(12,2)
    val t3 = new Time(13,2)
    println(t1 + " before " + t2 + "? " + t1.before(t2))
    println(t1 + " before " + t3 + "? " + t1.before(t3))
  }
}
