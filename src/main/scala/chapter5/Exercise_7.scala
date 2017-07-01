package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 编写一个Person类，其主构造器接受一个字符串，该字符串包含名字、空格和姓，
  * 如new Person("Fred Smith")。提供只读属性firstName和lastName。主构造器应该
  * 是var、val还是普通参数呢？为什么？
  */
object Exercise_7 {
  class Person(val name: String) {
    val names = name.split(" ")
    val firstName = names(0)
    val lastName = names(1)

    override def toString: String = "firstName:" + firstName + ", lastName:" + lastName

  }

  def main(args: Array[String]): Unit = {
    val p = new Person("Hello world")
    println(p)
  }
}
