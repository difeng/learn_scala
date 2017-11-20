package chapter17

/**
  * Created By difeng on 2017/11/13
  *
  */
object chapter17 extends App {

  class Hello {
     var name: String = ""
     var age: Int = 0

     override def toString: String = "{" + "name:" + name + ",age:" + age + "}"
  }

  class Pair[T, S](val first: T, val second: S)

  val p = new Pair(42, "String")
  var h = new Hello()
  h.name = "hello"
  h.age = 1
  val p1 = new Pair("hello", h)
  println(p1)

  def getMiddle[T] (a: Array[T]) = a(a.length / 2)

  val f = getMiddle[String] _

  val f1 = getMiddle[Hello] _

  println(f(Array("a", "b", "c", "d")))
  println(f1(Array(new Hello())))

  class PPPair[T <: Comparable[T]] (val first: T, val second: T) {

    def smaller = if (first.compareTo(second) < 0) first else second

    def bigger = if (first.compareTo(second) < 0) second else first
  }

  class Person {

  }

  class Student extends Person {

  }

  class PPair[+T](val first: T, val sencond: T)

  def makeFriends(p: PPair[Person]) = {

  }

  makeFriends(new PPair[Student](new Student(), new Student()))

  trait Friend[-T] {
    def befriend(some: T)
  }

  abstract class List[T] {
    def isEmpty: Boolean
    def head: T
    def tail: List[T]
  }

  class Node[T](val head: T, val tail: List[T]) extends List[T] {
    def isEmpty = false
  }

  class Empty[T] extends List[T] {
    def isEmpty = true
    def head = throw new UnsupportedOperationException
    def tail = throw new UnsupportedOperationException
  }


//  object Empty[T] extends List[T]

//  object Empty extends List[Nothing]
}
