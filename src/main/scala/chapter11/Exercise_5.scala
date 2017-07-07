package chapter11

import scala.collection.mutable.ArrayBuffer

/**
  * Created by difeng on 2017/7/7.
  * 提供操作符用于构造HTML表格。例如：
  * Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  * 应输出
  * <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling...
  */
object Exercise_5 extends App {

  class Table {

    val tableHtml = new ArrayBuffer[String]()

    val tdsInTrHtml = new ArrayBuffer[String]()

    def | (piece: String) = {
      tdsInTrHtml += s"<td>$piece</td>"
      this
    }

    def || (piece: String) = {
      tableHtml += s"<tr>${tdsInTrHtml.mkString}</tr>"
      tdsInTrHtml.clear()
      this | piece
    }

    override def toString: String = s"<table>${tableHtml.mkString}</table>"
  }
  
  object Table {
    def apply(): Table = new Table()
  }

  val html = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  println(html)
}
