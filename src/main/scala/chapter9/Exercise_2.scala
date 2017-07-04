package chapter9

import java.io._

import scala.io.Source

/**
  * Created by difeng on 2017/7/3.
  * 编写scala程序从一个带有制表符的文件读取内容，将每个制表符替换成一组空格，
  * 使得制表符隔开的n列任然保持纵向对齐，并将结果写入同一个文件
  */
object Exercise_2 extends App {
  //write a file
  val out = new PrintWriter("src/main/scala/chapter9/tables.txt")
  for (i <- 1 to 10) {
    val cells = Array("a","b","c")
    val line = cells.map(x => x + i).mkString("\t")
    out.println(line)
  }
  out.close()

  //reverse the file
//  val source = Source.fromFile("src/main/scala/chapter9/tables.txt")
//  val arr = source.getLines.toArray
//  val out1 = new PrintWriter("src/main/scala/chapter9/tables.txt")
//  for (line <- arr) {
//    out1.println(line.replaceAll("\t"," "))
//  }
//  out1.close()
}
