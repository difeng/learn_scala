package chapter11

/**
  * Created by difeng on 2017/7/7.
  * 提供一个ASCIIArt类，其对象包含类似这样的图形:
  *   /\_/\
     ( ' ' )
     (  -  )
     (_ _|_ _)
     提供将两个ASCIIArt图形横向或纵向结合的操作符。选用适当优先级的操作符命名。
     横向结合实例:
      /\_/\      -----
     ( ' ' )   / Hello \
     (  -  )  <  Scala |
      | | |    \ Color /
     (_ _|_ _)   -----
  */
object Exercise_6 extends App {

  class ASCIIArt(val art: String) {

    def + (other: ASCIIArt): ASCIIArt = {
      val str = art.split("\r\n").zip(other.art.split("\r\n")).map(x => x._1 + x._2).mkString("\r\n")
      ASCIIArt(str)
    }

    def ++ (other: ASCIIArt): ASCIIArt = {
      ASCIIArt(art1 + "\r\n" + other.art)
    }

    override def toString: String = art

  }
  
  object ASCIIArt {
    def apply(art: String): ASCIIArt = new ASCIIArt(art)
  }

  val art1Str ="""
     /\_/\
    ( ' ' )
    (  -  )
     | | |
    (_ _|_ _)"""

  val art2Str ="""
       -----
     / Hello \
    <  Scala |
     \ Coder /
       -----"""
  val art1 = ASCIIArt(art1Str)
  println("art1:\n" + art1)
  val art2 = ASCIIArt(art2Str)
  println("art2:\n" + art2)
  val art3 = art1 + art2
  println("art3:\n" + art3)
  val art4 = art1 ++ art2
  println("art4:\n" + art4)
}
