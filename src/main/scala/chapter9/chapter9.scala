package chapter9

import java.io.ObjectOutputStream

import com.sun.xml.internal.ws.developer.Serialization


/**
  * Created by difeng on 2017/7/3.
  */
object chapter9 extends App {
  /**
    *Source.fromFile(...).getLines.toArray输出文件的所有行
    *Source.fromFile(...).mkString以字符串形式输出文件内容
    * 将字符串转换为数字，可以用toInt或toDouble方法
    * 使用Java的PrintWriter来写入文本文件
    * “正则”.r是一个Regex对象
    * 如果你的正则表达式包含反斜杠或引号的话，用"""..."""
    * 若果正则模式包含分组，你可以用如下语法来提取它们的内容for (regex(变量1,...,变量n)<-字符串)
    *
    *
    **/

  import scala.io.Source

  var source = Source.fromFile("src/main/scala/chapter9/myfile.txt", "UTF-8")
  println(source.mkString)

  source = Source.fromFile("src/main/scala/chapter9/myfile.txt", "UTF-8")
  for (l <- source.getLines) {
    println(l)
  }

  source = Source.fromFile("src/main/scala/chapter9/myfile.txt", "UTF-8")
  val lines = source.getLines.toArray
  println(lines.mkString)


  //read bianry file
  import java.io.File
  import java.io.FileInputStream
  val file = new File("src/main/scala/chapter9/myfile.txt")
  val in = new FileInputStream(file)
  val bytes = new Array[Byte](file.length().toInt)
  in.read(bytes)
  in.close()

  //writing file
  import java.io.PrintWriter
  val out = new PrintWriter("src/main/scala/chapter9/numbers.txt")
  for (i <- 1 to 100) out.println(i)
  out.close()

  //visit directory
  def subDirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subDirs _)
  }
  println(subDirs(new File("src/main/scala")).mkString("\n"))

  //序列化
  class Person(val name: String) extends Serializable
  val fred = new Person("fred")
  import java.io.{FileOutputStream,ObjectOutputStream,ObjectInputStream}
  val outObj = new ObjectOutputStream(new FileOutputStream("src/main/scala/chapter9/test.obj"))
  outObj.writeObject(fred)
  outObj.close()
  val inObj = new ObjectInputStream(new FileInputStream("src/main/scala/chapter9/test.obj"))
  val savedFred = inObj.readObject().asInstanceOf[Person]
  println(savedFred.name)

  //正则表达式
  val numPattern = """[0-9]+""".r
  for(matchString <- numPattern.findAllIn("99 bottles,98 bottles"))
    println(matchString)
  //findFirstIn 匹配首个匹配项
  //findPrefixOf 检查某个字符串的开始部分是否能匹配
  //replaceFirstIn 替换首个匹配项
  //replaceAllIn 替换所有匹配项

  //正则表达式组
  val numitemPattern = "([0-9]+) ([a-z]+)".r

  for (numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles,98 bottles"))
    println(num + " " + item )
}
