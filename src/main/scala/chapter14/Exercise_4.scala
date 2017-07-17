package chapter14

/**
  * Created by difeng on 2017/7/16.
  */
object Exercise_4 extends App {

  abstract class Item

  case class Article(description: String, price: Double) extends Item

  case class Boundle(description: String, discount: Double, items: Item*) extends Item

  case class Multiple(num: Int,item: Item) extends Item

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Boundle(_, disc, its @ _*) => its.map(price _).sum - disc
    case Multiple(n, x) => n * price(x)
  }


  println(price(Multiple(10, Article("Black", 29.95))))
}
