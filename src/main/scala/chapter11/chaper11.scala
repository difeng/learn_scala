package chapter11

import scala.collection.mutable

/**
  * Created by difeng on 2017/7/7.
  */
object chaper11 extends App {
  /**
    标识符由字母、数字或运算符构成
    一元二元操作符其实是方法调用
    操作符优先级取决于第一个字符，而结合性取决于最后一个字符
    apply和update方法在对expr(args)表达式求值时被调用
    提取器从输入中提取元组或值的序列
    **/
  //标识符
  //反引号中可以包含几乎任何字符
  val `val` = 1
  //中置操作 a 标识符 b
  1 to 10
  //一元操作 a 标识符
  1 toString
  //赋值操作符
  //a 操作符=b
  //优先级
//  除赋值操作符外，优先级有操作符的首字符决定
//  最高优先级:除以下字符外的操作符
//  */%
//  +-
//  :
//  <>
//  !=
//  &
//  ^
//  |
//  非操作符
//  最低优先级：赋值操作符

//  结合性
//  在scala中所有的操作符都是左结合的，除了
//  以冒号(:)结尾的操作符 和 赋值操作符， 尤其是用于构造列表的::操作符是右结合的


//  apply和update方法
//  f如果不是函数和方法
//  f(arg1,arg2,...) 相当于  f.apply(arg1,arg2,...)
//  f(arg1,arg2,...) = value  相当于  f.update(arg1,arg2,...,value)
//  这个机制被用于数组和映射。例如:
    val scores = new mutable.HashMap[String,Int]()
    scores("Bob") = 100 //调用scores.update("Bob", 100)
    val bobsScore = scores("Bob") //调用scores.apply("Bob")
    println("bobsScore:" + bobsScore)
//  提取器 一个带有unapply方法的对象
    object Name {
      def unapply(arg: String): Option[(String, String)] = {
        val pos = arg.indexOf(" ")
        if (pos == -1) None
        else Some(arg.substring(0, pos), arg.substring(pos + 1))
      }
    }

    val Name(firstName, lastName) = "denny Du"
    println("firstName:" + firstName)
    println("lastName:" + lastName)
//  带单个参数或无参数的提取器
//  unapplySeq方法 要提取任意长度的值的序列
}
