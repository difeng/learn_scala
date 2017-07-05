package chapter10

/**
  * Created by difeng on 2017/7/5.
  * 提供一个CryptoLogger类，将日志消息以凯撒密码加密。缺省情况下密钥为3，
  * 不过使用这也可以重写它。提供缺省密钥和-3作为密钥时的使用实例
  */
object Exercise_4 extends App {

  trait Cryto {
    var offset = 3
    val dict = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val deDict = crytoStr(dict)
    def crytoStr(in: String): String = {
      in.map(x => {
        if (!x.equals(' ')) {
          val orgIndex = dict.indexOf(x.toUpper)
          val newIndex = (26 + orgIndex + offset) % 26
          dict(newIndex)
        } else x
      }).mkString
    }

    def deCrytoStr(in: String): String = {
      in.map(x => {
        if (!x.equals(' ')) {
          val orgIndex = deDict.indexOf(x.toUpper)
          val newIndex = (26 + orgIndex - offset) % 26
          deDict(newIndex)
        } else x

      }).mkString
    }
  }

  class CryptoLogger extends Cryto {
    def log(msg: String): String = {
      crytoStr(msg)
    }
  }

  val logger = new CryptoLogger
  val msg = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
  val cryptoMsg = logger.log(msg)
  println("明文:" + msg)
  println("加密:" + cryptoMsg)
  println("解密:" + logger.deCrytoStr(cryptoMsg))





}
