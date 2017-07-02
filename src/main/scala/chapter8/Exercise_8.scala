package chapter8

/**
  * Created by difeng on 2017/7/2.
  * 编译8.6节中的Person和SecretAgent类并使用javap分析类文件。总共有多少个name的getter方法？
  * 它们分别取什么值？
  *
  */
object Exercise_8 {

  class Person(val name: String) {
    override def toString: String = getClass.getName + "[name=" + "]"
  }

  class SecretAgent(codename: String) extends Person(codename) {
    override val name = "secret"
    override val toString = "secret"
  }

}
