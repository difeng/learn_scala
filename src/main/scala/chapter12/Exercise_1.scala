package chapter12

/**
  * Created by difeng on 2017/7/9.
  * 编写函数values(fun: (Int) => Int, low: Int, high: Int)，该函数输出一个集合，对应给定区间
  * 内给定函数的输入和输出。比如,values(x => x * x, -5,5)应该产出一个对偶集合
  * (-5,25),(-4,16),(-3,9),(-2,4),(-1,1),(0,0),(1,1),(2,4),(3,9),(4,16),(5,25)
  */
object Exercise_1 extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = {
    (low to high).map(x => (x,fun(x)))
  }

  println(values(x => x * x, -5,5).mkString(","))

}
