package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 编写一个scala应用程序，使用App特质，以反序打印命令参数，用空格隔开。
  * 举例来说，scala Reverse Hello World应该打印出World Hello。
  */
object Reverse extends App {
  args.reverse.foreach(arg => print(arg + " "))
}
