package chapter5

import scala.beans.BeanProperty

/**
  * Created by difeng on 2017/6/30.
  * 创建一个Student类，加入可读写的JavaBeans属性name(类型为String)和id(类型为Long)。
  * 有哪些方法被生成？(用javap查看)你可以在scala中调用JavaBeans版的getter和setter方法吗？
  * 应该这样做吗？
  */
object Exercise_5 {


  def main(args: Array[String]): Unit = {
    class Student {
      @BeanProperty var name:String = _
      @BeanProperty var id:Long = _
    }
    val stu = new Student()
    stu.name = "hello"
    stu.setId(1)
    stu.setName("hello1")
    println(stu.getId + "," + stu.getName)
  }

}
