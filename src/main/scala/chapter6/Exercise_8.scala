package chapter6

/**
  * Created by difeng on 2017/7/1.
  * 编写一个枚举，描述RGB立方体的8个角。ID使用颜色值(例如，红色是0xff0000)
  */
object Exercise_8 {
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

  def main(args: Array[String]): Unit = {
    for(c <- RGB.values) println(c.id + ":" + c)
  }

}
