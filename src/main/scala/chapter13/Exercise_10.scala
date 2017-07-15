package chapter13

import java.io.File

import scala.collection.immutable

/**
  * Created by difeng on 2017/7/15.
  */
object Exercise_10 extends App {

  val fs = new File("src/main/scala/chapter13")

  val str = fs.listFiles().map(_.getName).reduce(_ + _)
  val frequencies = str.par.aggregate(immutable.HashMap[Char, Int]())(
    (m, c) => {
      m + (c -> (m.getOrElse(c,0) + 1))
    },
    (m1, m2) => {
      (m1.keySet ++ m2.keySet).foldLeft(immutable.HashMap[Char, Int]())(
        (ret, k) => {
          ret + (k -> (m1.getOrElse(k, 0) + m2.getOrElse(k, 0)))
        }
      )
    }
  )
  println(frequencies('c'))
}

