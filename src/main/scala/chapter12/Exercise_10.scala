package chapter12

/**
  * Created by difeng on 2017/7/10.
  * 实现一个unless控制抽象，工作机制类似if，但条件是反过来的。第一个参数需要是
  * 换名调用的参数吗？你需要柯里化吗？
  */
object Exercise_10 extends App {

  def unless(condition: => Boolean)(block: => Unit) = {
    if (! condition) block
  }

  unless(1 == 2) {println("Hello")}
}
