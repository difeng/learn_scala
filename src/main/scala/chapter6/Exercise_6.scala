package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 编写一个扑克牌4种花色枚举，让其toString方法分别返回
  * ♣、♦、♥、♠
  */
object Exercise_6 {

  object Card extends Enumeration {
    val club =  Value("♣")
    val diamond = Value("♦")
    val spade = Value("♥")
    val heart = Value("♠")
  }

  def main(args: Array[String]): Unit = {
    for(card <- Card.values) { println(card.toString + " ")}
  }

}
