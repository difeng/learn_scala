package chapter13

/**
  * Created by difeng on 2017/7/14.
  */
object Exercise_6 extends App {

  val lst = List(1,2,3,4,5)

  println((1 /: lst)(_ + _))

  println((lst :\ List[Int]())(_ :: _))

  println((List[Int]() /:lst)(_ :+ _))

  println((List[Int]() /:lst)((a, b) => b :: a))

  println((lst :\ List[Int]())((a, b) => b :+ a))

}
