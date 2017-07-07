package chapter11

/**
  * Created by difeng on 2017/7/7.
  * 根据优先级规则，3+4->5和3->4+5是如何求值的
  */
object Exercise_1 extends App {
  //先求值3 + 4,再执行->5
  println(3+4->5)
//  报错,3->4，再+5，结果类型不匹配出错
//  println(3->4+5)
}
