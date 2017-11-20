package chapter17

/**
  * Created By difeng on 2017/11/14
  */
object Exercise_02 extends App {

  class Pair[T](val t: T, val s: T) {
    def swap(): Pair[T] = {
      new Pair(s, t)
    }

    override def toString(): String  = s"[$t, $s]"
  }


  val p1 = new Pair(1, 2)
  println(p1.swap())


}
