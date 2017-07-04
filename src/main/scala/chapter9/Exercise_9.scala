package chapter9
import java.io.File
/**
  * Created by difeng on 2017/7/4.
  * 编写Scala程序，盘点给定目录及其子目录中总共有多少以.class为扩展名的文件
  */
object Exercise_9 extends App {

  def countClassFile(dir: File): Int = {
    val c = dir.listFiles.filter(_.getName.endsWith(".class")).size
    val subCounts = dir.listFiles.filter(_.isDirectory)
    c + subCounts.map(countClassFile _).sum
  }

  println(countClassFile(new File("target")))



}
