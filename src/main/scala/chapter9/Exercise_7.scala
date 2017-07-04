package chapter9
import scala.io.Source
/**
  * Created by difeng on 2017/7/4.
  * 编写Scala程序，从文本文件读取内容，并打印出所有浮点数的词法单元。要求使用正则表达式
  */
object Exercise_7 extends App {
  val source = Source.fromFile("src/main/scala/chapter9/floats.txt")
  val wordPattern = """^((?!^[-]?\d*\.\d+$).)+$""".r
  for (token <- source.mkString.split("\\s+")) {
    wordPattern.findAllIn(token).foreach(println)
  }



}
