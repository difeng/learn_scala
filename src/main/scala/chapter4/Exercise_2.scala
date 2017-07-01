package chapter4

import java.io.File
import java.util.Scanner
import scala.collection.mutable
/**
  * Created by difeng on 2017/6/30.
  * 编写一段程序，从文件中读取单词。用一个可变映射来清点每一个单词出现的频率。
  * 读取这些单词的操作可以使用java.util.Scanner:
  * val in = new java.util.Scanner(new java.io.File("myfile.txt"))
  * while (in.hasNext()) 处理 in.next()
  */
object Exercise_2 {

  def main(args: Array[String]): Unit = {
    val in = new Scanner(new File("src/main/scala/chapter4/myfile.txt"))
    val countMap = new mutable.HashMap[String,Int]()
    while (in.hasNext()) {
      val word = in.next()
      countMap(word) = countMap.getOrElse(word,0) + 1
    }
    countMap.foreach(println)
  }
}
