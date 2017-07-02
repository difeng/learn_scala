package chapter8

/**
  * Created by difeng on 2017/7/2.
  */
object Exercise_3 {

  abstract class Shape {
    def area: Double
    def perimeter: Double
  }

  class Circle(val r: Double) extends Shape {

    def area: Double = {
      Math.PI * r * r / 2
    }

    def perimeter: Double = {
      Math.PI * r
    }
  }


  class Rectangle(val w: Double,val h: Double) extends Shape {

    def area: Double = w * h

    def perimeter: Double = 2 * (w + h)
  }

  class Triangle(val a: Double,val b: Double,val c: Double) extends Shape {

    def area: Double = {
      val s = perimeter / 2
      Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    def perimeter: Double = a + b + c
  }

  def main(args: Array[String]): Unit = {
    val s1 = new Circle(10)
    println("Circle(3)")
    println("perimeter:" + s1.perimeter)
    println("area:" + s1.area)

    val s2 = new Rectangle(10,2)
    println("Rectangle(10,2)")
    println("perimeter:" + s2.perimeter)
    println("area:" + s2.area)

    val s3 = new Triangle(3,4,5)
    println("Triangle(3,4,5)")
    println("perimeter:" + s3.perimeter)
    println("area:" + s3.area)
  }

}
