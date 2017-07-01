package chapter7

/**
  * Created by duyongfeng@creditzx.com on 2017/6/30.
  */
object Exercise_7 {

  import java.util.{ HashMap => JavaMap}
  import scala.collection.mutable.{ HashMap => ScalaMap}

  def copyJavaMapToScalaMap(map: JavaMap[String,String]): ScalaMap[String,String] = {
    var scalaMap = new ScalaMap[String,String]()
    for(k <- map.keySet().toArray()) {
      scalaMap += (k.toString -> map.get(k).toString)
    }
    scalaMap
  }

  def main(args: Array[String]): Unit = {
    val javaMap = new JavaMap[String,String]()
    javaMap.put("1","1")
    javaMap.put("2","2")
    javaMap.put("3","3")
    val scalaMap = copyJavaMapToScalaMap(javaMap)
    println(scalaMap.mkString(","))
  }

}
