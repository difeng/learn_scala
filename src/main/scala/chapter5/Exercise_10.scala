package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 考虑如下的类
  * class Employ(val name:String,var salary:Double){
  *   def this(){this("John Q. Public",0.0)}
  * }
  *
  * 重写该类,使用显示的字段定义，和一个缺省主构造器。你更倾向于使用哪种形式？为什么？
  */
object Exercise_10 {
  def main(args: Array[String]): Unit = {
    class Employee {
      val name: String = "tom"
      var sarlary: Double = 1.0
    }
  }
}
