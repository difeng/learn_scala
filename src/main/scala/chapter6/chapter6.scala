package chapter6

/**
  * Created by difeng on 2017/6/27.
  */
object chapter6 {

  def exercise1(): Unit = {
    object Conversions {
      def inchesToCentimeters(): Unit = {}
      def gallonsToLiters(): Unit = {}
      def milesTokilometers(): Unit = {}
    }
  }

  def exercise2(): Unit = {
    abstract class UnitConversion {
      def inchesToCentimeters() {}
      def gallonsToLiters() {}
      def milesTokilometers() {}
    }

    object InchesToCentimeters extends UnitConversion {
      override def inchesToCentimeters() = {}
    }

    object GallonsToLiters extends UnitConversion {
      override def gallonsToLiters() = {}
    }

    object MilesToKilometers extends UnitConversion {
      override def milesTokilometers() = {}
    }

  }

  def exercise3 (): Unit = {
    object origin extends java.awt.Point {

    }
    println(origin)
  }

  def exercise5(): Unit = {

  }

  def exercise6(): Unit = {
    object Card extends Enumeration {
      val club =  Value("♣")
      val diamond = Value("♦")
      val spade = Value("♥")
      val heart = Value("♠")
    }
    for(card <- Card.values) { println(card.toString + " ")}
  }

  def exercise7(): Unit = {
    object Card extends Enumeration {
      val club =  Value("♣")
      val diamond = Value("♦")
      val spade = Value("♥")
      val heart = Value("♠")

      def isSpade(card: Card.Value): Boolean = {
        card == spade || card == diamond
      }
    }
    println(Card.isSpade(Card.spade))
  }

  def exercise8(): Unit = {
    object RGB extends Enumeration {
      val RED = Value(0xff0000,"RED")
      val BLACK = Value(0x000000,"BLACK")
      val GREEN = Value(0x00ff00,"GREEN")
      val CYAN = Value(0x00ffff,"CYAN")
      val YELLOW = Value(0xffff00,"YELLOW")
      val WHITE = Value(0xffffff,"WHITE")
      val BLUE = Value(0x0000ff,"BLUE")
      val MAGENTA = Value(0xff00ff,"MAGENTA")
    }
    for(c <- RGB.values) println(c.id + ":" + c)
  }

  def main(args: Array[String]): Unit = {
    exercise1()
    exercise2()
    exercise3()
    exercise5()
    exercise6()
    exercise7()
    exercise8()
  }
}
