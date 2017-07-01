package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 实现一个函数，检查某张牌的花色是否为红色
  */
object Exercise_7 {

  object Card extends Enumeration {
    val club =  Value("♣")
    val diamond = Value("♦")
    val spade = Value("♥")
    val heart = Value("♠")

    def isSpade(card: Card.Value): Boolean = {
      card == spade || card == diamond
    }
  }

  def main(args: Array[String]): Unit = {
    println(Card.isSpade(Card.spade))
  }

}
