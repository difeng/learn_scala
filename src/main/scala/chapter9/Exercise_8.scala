package chapter9

import scala.io.Source

/**
  * Created by difeng on 2017/7/4.
  * 编写Scala程序，打印出某个网页中所有的image标签的src属性。使用正则表
  */
object Exercise_8 extends App {
  val source = Source.fromFile("src/main/scala/chapter9/image.html")
  val imgPattern = """<img.*?src=["'](.+?)["'].*?>""".r
  for (imgPattern(src) <- imgPattern.findAllIn(source.mkString)) {
    println(src)
  }
}
