package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 编写一个Timer类，加入只读属性hours和minutes，和
  * 一个检查某一时刻是否早于另一时刻的方法before(other: Time): Boolean
  * Time对象应该以new Time(hrs,min)方式构建，其中hrs小时数以军用时间格式呈现(介于0和23之间)
  */
object Exercise_3 {

  def main(args: Array[String]): Unit = {

    class Time(val hours: Int,val minutes: Int) {

      def before(other: Time): Boolean = {
        if (other.hours < hours) true
        else if (other.hours == hours) other.minutes < minutes
        else false
      }

      override def toString: String = hours + ":" + minutes
    }
    val t1 = new Time(12,1)
    val t2 = new Time(12,2)
    val t3 = new Time(13,2)
    println(t1 + " before " + t2 + "? " + t1.before(t2))
    println(t1 + " before " + t3 + "? " + t1.before(t3))
  }
}
