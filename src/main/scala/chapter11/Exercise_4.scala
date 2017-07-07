package chapter11

/**
  * Created by difeng on 2017/7/7.
  * 实现一个Money类，加入美元和美分字段。提供+、-操作符以及比较操作符==和<。
  * 举例来说，Money(1, 75) + Money(0,50) == Money(2,25)应为true。
  * 你应该同时提供*和/操作符吗？
  */
object Exercise_4 extends App {

  class Money(val dollar: Int,val cents: Int) {

    def + (other: Money): Money = {
      Money(this.dollar + other.dollar + (this.cents + other.cents) / 100, (this.cents + other.cents) % 100)
    }

    def - (other: Money): Money = {
      val remainCents = this.dollar * 100 + this.cents - (other.dollar * 100 + other.cents)
      if (remainCents < 0)
        Money(remainCents / 100, - (remainCents % 100))
      else
        Money(remainCents / 100, remainCents % 100)
    }

    def == (other: Money): Boolean = {
      this.dollar == other.dollar && this.cents == other.cents
    }

    def < (other: Money): Boolean = {
      (this.dollar * 100 + this.cents) < (other.dollar * 100 + other.cents)
    }

    override def toString: String = this.dollar + "," + this.cents

  }
  
  object Money {
    def apply(dollar: Int, cents: Int): Money = new Money(dollar, cents)
  }

  val m1 = Money(10,5)
  val m2 = Money(6,10)
  println(m1 + m2)
  println(m2 - m1)
  println(m1 == m2)
  println(m1 < m2)
}
