package chapter11

import sun.security.util.BitArray

/**
  * Created by difeng on 2017/7/7.
  * 实现一个BigSequence类，将64个bit的序列打包在一个Long值中。
  * 提供apply和update操作来获取和设置某个具体的bit
  */
object Exercise_7 extends App {

  class BigSequence {
    var value: Long = 0
    def update(pos: Int,bit: Int) = {
      value |= (bit & 1L) << (pos % 64 - 1)
    }

    def apply(pos: Int): Long = {
      if ((value >> (pos % 64 - 1) & 1L) == 1)
        1
      else
        0
    }

    override def toString: String = "%64s".format(value.toBinaryString).replace(" ","0")
  }

  val a = new BigSequence()
  a(2) = 1
  println(a)
  a(63) = 1
  a(64) = 1
  println(a)
  println(a(63))
  println(a(64))
}
