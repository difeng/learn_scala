package chapter8
/**
  * Created by difeng on 2017/7/2.
  * 设计一个Point类，其x和y坐标可以通过构造器提供。提供一个子类LabeledPoint，
  * 其构造函数接收一个标签值和x、y坐标，比如：
  * new LabeledPoint("Black Thursday",1929,230.07)
  */
object Exercise_5 {

  class Point(val x: Double,val y: Double) {

  }

  class LabeledPoint(label: String,x: Double,y: Double) extends Point(x: Double,y: Double) {

    override def toString: String =  s"$label($x,$y)"
  }

  def main(args: Array[String]): Unit = {
    println(new LabeledPoint("Black Thursday",1929,230.07))
  }

}
