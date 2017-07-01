
val arr = Array(10)
//Array(10) is different from arr1
val arr1 = new Array(10)

object Color extends Enumeration {
  type MyColor = Value
  val Red = Value("stop")
  val Yellow = Value("slow")
  val Green = Value("go")
}

for(c <- Color.values) println(c.id + ":" + c)

