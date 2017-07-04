package chapter9

import java.io._
import scala.collection.mutable.ArrayBuffer

/**
  * Created by difeng on 2017/7/4.
  * 扩展那个可序列化的Person类，让它能以一个集合保存某个人的朋友信息。
  * 构造出一些person对象，让他们中的一些人成为朋友，然后将Array[Person]
  * 保存到文件。将这个数组从文件中重新读出来，检验朋友关系是否完好。
  */
object Exercise_10 extends App {
  class Person(val name: String) extends Serializable {

    val friends = new ArrayBuffer[Person]()

    def addFriends(person: Person): Unit = {
      friends += person
    }

    override def toString = {
      s"name:$name,friends:${friends.map(_.name).mkString(",")}"
    }

  }

  val p1 = new Person("tom")
  val p2 = new Person("lily")
  val p3 = new Person("deny")
  val p4 = new Person("alis")

  p1.addFriends(p2)
  p1.addFriends(p3)
  p2.addFriends(p1)
  p2.addFriends(p4)
  p3.addFriends(p1)
  p4.addFriends(p4)

  val friendsArr = Array(p1,p2,p3,p4)
  val out = new ObjectOutputStream(new FileOutputStream("src/main/scala/chapter9/friends.obj"))
  out.writeObject(friendsArr)
  out.close()
  val in = new ObjectInputStream(new FileInputStream("src/main/scala/chapter9/friends.obj"))
  val savedFriendsArr = in.readObject().asInstanceOf[Array[Person]]
  println(savedFriendsArr.mkString("\n"))
}
