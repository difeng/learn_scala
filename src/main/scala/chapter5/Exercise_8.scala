package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 创建一个Car类，以只读属性对应制造商，型号名称，型号年份以及一个可读写的属性用于车牌。
  * 提供四组构造器。每个构造器fc都要求制造商和型号为必填。
  * 型号年份和车牌可选，如果未填，则型号年份为-1，车牌为空串。
  * 你会选择哪一个作为你的主构造器？为什么？
  */
object Exercise_8 {

  class Car(val maker: String, val typeName: String, val year: Int = -1, var no: String = "") {

    override def toString = s"Car($maker, $typeName, $year, $no)"
  }

  def main(args: Array[String]): Unit = {
    val car = new Car("A","car1")
    println(car)
  }

}
