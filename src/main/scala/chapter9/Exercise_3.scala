package chapter9

import scala.io.Source

/**
  * Created by difeng on 2017/7/3.
  * 编写一小段scala代码，从一个文件读取内容并把所有字符数大于12的单词打印到控制台。
  * 如果你能用单行代码完成会有额外奖励
  */
object Exercise_3 extends App {
  "[a-zA-Z]+".r.findAllIn(Source.fromFile("src/main/scala/chapter9/chapter9.scala","UTF-8").mkString).toArray.filter(x => x.length > 12).foreach(println)
}
