package chapter11

/**
  * Created by difeng on 2017/7/8.
  * 为RichFile类定义unapply操作，提取文件路径、名称、和扩展名。
  * 举例来说，文件/home/cay/readme.txt的路径为/home/cay,名称为readme，扩展名为txt。
  */
object Exercise_9 extends App {

   class RichFile(val filePath: String) {

   }

   object RichFile {
     def unapply(arg: RichFile): Option[(String,String,String)] = {
       val pos1 = arg.filePath.lastIndexOf("/")
       val pos2 = arg.filePath.lastIndexOf(".")
       if (pos2 < 0 || pos1 < 0) Some(("","",""))
       else {
         val path = arg.filePath.substring(0,pos1)
         val name = arg.filePath.substring(pos1 + 1,pos2)
         val ext = arg.filePath.substring(pos2 + 1)
         Some((path,name,ext))
       }

     }
   }

   val rf = new  RichFile("/home/cay/readme.txt")
   val RichFile(path,name,ext) = rf
   println("file:" + rf.filePath)
   println(s"path:$path\nname:$name\next:$ext")

}
