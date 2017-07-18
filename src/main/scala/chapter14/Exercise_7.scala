package chapter14

/**
  * Created by difeng on 2017/7/18.
  */
object Exercise_7 extends App {

  sealed abstract class BinaryTree

  case class Leaf(value: Int) extends BinaryTree

  case class Node(child: BinaryTree*) extends BinaryTree

  def leafSum(binaryTree: BinaryTree): Int = binaryTree match {
      case Leaf(x) => x
      case Node(nodes @_*) => nodes.map(leafSum(_)).reduce(_ + _)
    }


  val tree = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
  println(leafSum(tree))

}
