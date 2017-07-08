package chapter11
/**
  * Created by difeng on 2017/7/8.
  * 为RichFile类定义一个unapplySeq，提取所有路径段。举例来说，对于/home/cay/readme.txt,
  * 你应该产出三个路径段序列：home、cay和readme.txt
  */
object Exercise_10 extends App {

  class RichFile(val filePath: String) {

  }

  object RichFile {
    def unapply(arg: RichFile): Option[Seq[String]] = {
      if (arg.filePath == "") None
      else
        Some(arg.filePath.split("/"))

    }
  }

  val rf = new  RichFile("/home/cay/readme.txt")
  val RichFile(path) = rf
  println("file:" + rf.filePath)
  println(s"path:\n${path.mkString(" ")}")
}
