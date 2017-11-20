package chapter17

/**
  * Created By difeng on 2017/11/20
  */
object Exercise_03 extends App {

  class Pair[T, S](val t: T, val s: S) {
    def swap(pair: Pair[T ,S]):  Pair[S ,T] = {
      new Pair(pair.s, pair.t)
    }

    override def toString: String = s"[$t, $s]"
  }

  val p1 = new Pair(1, "p1")
  val p2 = new Pair(2, "p2")
  val p3 = p1.swap(p2)
  println(p3)

}
