package chapter8

import scala.collection.mutable

/**
  * Created by difeng on 2017/7/2.
  * 定义一个抽象类Item，加入方法price和description。SimpleItem是一个在构造器
  * 中给出价格和描述的物件。利用val可以重写def这个事实。Bundle是一个可以包含其他物件的物件。
  * 器价格是打包中所有物件的价格之和
  */
object Exercise_4 {

  abstract class Item {

    def price: Double

    def description: String

  }

  class SimpleItem(val price: Double,val description: String) extends Item {

  }

  class Boudle extends Item {

    var items = List[Item]()

    def addItem(item: Item): Unit = {
      items = items :+ item
    }
    def price: Double = {
      items.map(x => x.price).sum
    }

    def description: String = {
      items.groupBy(_.description).map(x => x._1 + ",num:" + x._2.size).mkString("\n")
    }

  }

  def main(args: Array[String]): Unit = {
    val item = new SimpleItem(12,"Item")
    val item1 = new SimpleItem(12,"Item1")
    println(item.price)
    val boudle = new Boudle()
    boudle.addItem(item)
    boudle.addItem(item)
    boudle.addItem(item1)
    println(boudle.price)
    println(boudle.description)

  }

}
