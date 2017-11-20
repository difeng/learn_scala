package chapter17

/**
  * Created By difeng on 2017/11/14
  */
object Exercise_01 extends App {
   class Pair[T, S](val t: T, val s: S) {

     def swap(): Pair[S, T] = {
       new Pair(s, t)
     }

     override def toString() = s"($s,$t)"
   }

   val p1 = new Pair(1, "hello")
   println(p1)
   println(p1.swap())
}
