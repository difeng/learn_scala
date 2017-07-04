package chapter9

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by difeng on 2017/7/3.
  * 编写Scala程序，从包含浮点数的文本文件中读取内容，打印出文件中所有浮点数之和、
  * 平均值，最大值、最小值
  */
object Exercise_4 extends App {
  //write random numbers to file
  val out = new PrintWriter("src/main/scala/chapter9/floats.txt")
  out.println("10.00a abc 20.06cd 30.0")
  out.close()

  val arrs = "[0-9]+.[0-9]+".r.findAllIn(Source.fromFile("src/main/scala/chapter9/floats.txt","UTF-8").mkString).toArray
  val fArrs = arrs.map(x => x.toFloat)
  val min = fArrs.min
  val max = fArrs.max
  val sum = fArrs.sum
  val mean = sum / fArrs.length
  println(s"sum:$sum,max:$max,min:$min,mean:$mean")


}
