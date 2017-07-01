package random
import scala.math._
/**
  * Created by duyongfeng@creditzx.com on 2017/6/30.
  */
class Random {

  //随机种子
  var seed: Int = 0

  val a = BigDecimal(1664525)

  val b = BigDecimal(1013904223)

  val n: Int = 32

  def setSeed(seed: Int): Unit = {
    this.seed = seed
  }

  def nextInt(): Int = {
    var nextVal = ((seed * a + b) % BigDecimal(2).pow(n)).toInt
    this.seed = nextVal
    nextVal
  }

  def nextDouble(): Double = {
    var nextVal = (seed * a + b) % BigDecimal(2).pow(n)
    seed = nextVal.toInt
    nextVal.toDouble
  }
}

object Exercise3 {

  def main(args: Array[String]): Unit = {
    val rand = new Random()
    rand.setSeed(100)
    println(rand.nextInt())
    println(rand.nextDouble())
  }
}
