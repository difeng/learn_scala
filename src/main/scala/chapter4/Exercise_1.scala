package chapter4

/**
  * Created by difeng on 2017/6/30.
  * 设置一个映射，其中包含你想要的一些装备，以及它们的价格。
  * 然后构建另一个映射，采用同一组键，但在价格上打九折
  */
object Exercise_1 {

  def main(args: Array[String]): Unit = {
    val map = Map("smartisan phone" -> 2300,"mac pro" -> 12000,"kindle" -> 1000)
    val afterDiscountMap = for((k,v) <- map) yield(k,v * 0.9)
    println(afterDiscountMap)
  }
}
