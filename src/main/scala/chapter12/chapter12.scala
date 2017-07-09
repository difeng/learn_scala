package chapter12
import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton

import scala.math._
/**
  * Created by difeng on 2017/7/8.
  *
  * 在Scala中函数是“头等公民”，就和数字一样
  * 你可以创建匿名函数，通常还会把他们交给其他函数
  * 函数参数可以给出需要稍后执行的行为
  * 许多集合方法都接受函数参数，将函数应用到集合中的值
  * 有很多语法上的简写让你以简短且易读的方式表达函数参数
  * 你可以创建操作代码的函数块，它们看上去就像是内建的控制语句
  */
object chapter12 extends App {
  //作为值的函数
  def max(x: Int, y: Int): Int =  if (x > y) x else y
  val a = max _
  println(a(1,2))
  //匿名函数
  val min = (x: Int, y: Int) => if (x > y) y else x
  println(min(1, 2))
  //带函数参数的函数
  //(参数类型) => 结果类型
  def valueAtOneQuarter(f: (Double) => Double) = f(0.25)
  println(valueAtOneQuarter(ceil _))
  println(valueAtOneQuarter(sqrt _))
  println(valueAtOneQuarter((x: Double) => 3 * x))
  //参数(类型)推断
  val fun: (Double) => Double = 3 * _
  //一些有用的高阶函数
  (1 to 9).map(0.1 * _)
  (1 to 9).map("*" * _).foreach(println)
  //闭包
  def mulBy(factor: Double) = (x: Double) => factor * x
  val triple = mulBy(3)
  val half = mulBy(0.5)
  println(triple(3))
  println(half(3))
  //SAM(single abstract mothod)转换
  //implicit
  implicit def makeAction(action: (ActionEvent) => Unit) =
    new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = {action(e)}
    }
  var count = 0
  val button = new JButton("inc")
  button.addActionListener((e: ActionEvent) => count += 1)
  button.doClick()
  println(count)
  //柯里化
  //将原来接收两个参数的函数变为接收一个参数的函数
  def mul(x: Int,y: Int) = x * y
  def mulOneAtTime(x: Int) = (y: Int) => x * y
  def mulOneAtTimeSimple(x: Int)(y: Int) = x * y
  println(mulOneAtTime(3)(4) == mulOneAtTimeSimple(3)(4))
  //控制抽象

}
