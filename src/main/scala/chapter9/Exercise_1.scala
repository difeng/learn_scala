package chapter9
import java.io._
import scala.io.Source

/**
  * Created by difeng on 2017/7/3.
  * 编写一段scala代码，将某个文件中的行倒转顺序
  */
object Exercise_1 {

  def main(args: Array[String]): Unit = {
    //write a file
    val out = new PrintWriter("src/main/scala/chapter9/orders.txt")
    for (i <- 1 to 100) out.println(i)
    out.close()

    //reverse the file
    val source = Source.fromFile("src/main/scala/chapter9/orders.txt")
    val reverse = source.getLines.toArray.reverse
    val out1 = new PrintWriter("src/main/scala/chapter9/orders.txt")
    for (line <- reverse) {
      out1.println(line)
    }
    out1.close()

  }


}
