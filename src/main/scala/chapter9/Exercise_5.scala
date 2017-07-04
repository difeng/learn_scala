package chapter9

import java.io.PrintWriter

/**
  * Created by difeng on 2017/7/4.
  * 编写Scala程序，向文件中写入2的n次方及其倒数，指数n从0到20.对齐各列
  */
object Exercise_5 extends App {

  val out = new PrintWriter("src/main/scala/chapter9/2n.txt")
  for (n <- 0 to 20) {
    val pow2n =math.pow(2, n)
    out.println(" "*4 + pow2n.toInt + " "*(12-pow2n.toString().size)+math.pow(2, -n))
  }
  out.close()
}
