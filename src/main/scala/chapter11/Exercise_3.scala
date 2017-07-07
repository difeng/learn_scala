package chapter11
import scala.math.abs
/**
  * Created by difeng on 2017/7/7.
  * 实现Fraction类，支持 + - * /操作。支持约分，例如将15/-6变成-5/2。除以最大公约数
  */
object Exercise_3 extends App {

  class Fraction(n: Int, d: Int) {

    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)

    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    def + (other: Fraction): Fraction = Fraction(this.num * other.den + other.num * this.den,this.den * other.den)

    def - (other: Fraction): Fraction = Fraction(this.num * other.den - other.num * this.den,this.den * other.den)

    def * (other: Fraction): Fraction = Fraction(this.num * other.num, this.den * other.den)

    def / (other: Fraction): Fraction = Fraction(this.num * other.den, this.den * other.num)

    override def toString: String =  num  + "/"  + den
  }

  object Fraction {
    def apply(n: Int, d: Int): Fraction = new Fraction(n, d)
  }

  val a = new Fraction(2,3)
  val b = new Fraction(3,4)
  println(s"$a + $b = " + (a + b))
  println(s"$a - $b = " + (a - b))
  println(s"$a * $b = " + (a * b))
  println(s"$a / $b = " + (a / b))
}
