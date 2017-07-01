package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 改进5.1节的Count类，让它不要在Int.Max.Value时变成负数
  */
object Exercise_1 {

  def main(args: Array[String]): Unit = {
    class Counter {

      private  var value = BigInt(0)

      def increment() { value += BigInt(1)}

      def current() = value

    }
    val counter = new Counter()
    var i = BigInt(0)
    while(i < BigInt("1000")) {
      counter.increment()
      i += BigInt(1)
    }

    println(counter.current())
  }
}
