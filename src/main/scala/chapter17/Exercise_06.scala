package chapter17

/**
  * Created By difeng on 2017/11/20
  */
object Exercise_06 extends App {

  def middle[T](iterable: Iterable[T]): T = {
    val li = iterable.toList
    li(li.length / 2)
  }

  println(middle("World"))
}
