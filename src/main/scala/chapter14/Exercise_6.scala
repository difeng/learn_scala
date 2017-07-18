package chapter14

/**
  * Created by difeng on 2017/7/18.
  */
object Exercise_6 extends App {

  sealed abstract class BinaryTree

  case class Leaf(value: Int) extends BinaryTree

  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

  def leafSum(binaryTree: BinaryTree): Int = binaryTree match {
      case Leaf(x) => x
      case Node(left, right) => leafSum(left) + leafSum(right)
    }



  val tree = Node(Node(Leaf(3), Leaf(8)),Leaf(5))
  println(leafSum(tree))


}



