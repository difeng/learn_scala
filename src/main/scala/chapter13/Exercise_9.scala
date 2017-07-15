package chapter13

import scala.collection.mutable
import java.io.File

/**
  * Created by difeng on 2017/7/14.
  */
object Exercise_9 extends App {
  val frequencies = new mutable.HashMap[Char, Int] with
    scala.collection.mutable.SynchronizedMap[Char, Int]
  val fs = new File("src/main/scala/chapter13")
  fs.listFiles().foreach(
    x =>
      new Thread(new Runnable() {
        override def run() {
          x.getName.toCharArray.foreach(c => frequencies(c) = frequencies.getOrElse(c, 0) + 1)
        }
      }).start()

  )

  println(frequencies.mkString(","))
  println(frequencies.get('c'))
}
