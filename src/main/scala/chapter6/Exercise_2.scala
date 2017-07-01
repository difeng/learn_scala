package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 前一个练习不是很面向对象。提供一个通用的超类UnitConversion并
  * 定义扩展该超类的InchesToCentimeter、GallonsToLiters和MilesToKillometers对象
  */
object Exercise_2 {

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
