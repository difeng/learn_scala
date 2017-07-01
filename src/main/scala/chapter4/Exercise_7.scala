package chapter4

import scala.collection.JavaConversions.propertiesAsScalaMap
/**
  * Created by difeng on 2017/6/30.
  * 打印出所有java系统属性的表格
  */
object Exercise_7 {

  def main(args: Array[String]): Unit = {
    val props:scala.collection.Map[String,String] = System.getProperties
    val keyLen = for(k <- props.keySet) yield k.length
    val len = keyLen.max
    for((k,v) <- props) println(k + " " * (len - k.length) + " | " + v)
  }

}
