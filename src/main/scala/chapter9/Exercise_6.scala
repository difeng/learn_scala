package chapter9

import java.io.PrintWriter
import scala.io.Source

/**
  * Created by difeng on 2017/7/4.
  * 编写正则表达式，匹配Java或C++程序代码中类似"like this,mybe with \" or \\"
  * 这样带引号的字符串。编写Scala程序将某个源文件中所有类似的字符串打印出来
  */
object Exercise_6 extends App {
  val out = new PrintWriter("src/main/scala/chapter9/regex.txt")
  out.println("""abc like this,maybe with \" or \\"""")
  out.println("""bcd like this,maybe with \" or \\"""")
  out.close()

  val source = Source.fromFile("src/main/scala/chapter9/regex.txt")
  val values = source.mkString
  val pattern = """like this,maybe with \\" or \\{2}"""".r
  pattern.findAllIn(values).foreach(println)
}
