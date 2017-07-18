package chapter14

/**
  * Created by difeng on 2017/7/18.
  */
object Exercise_8 extends App {

  sealed abstract class BinaryTree

  case class Leaf(value: Int) extends BinaryTree

  case class Node(op: Char, child: BinaryTree*) extends BinaryTree

  def leafOp(binaryTree: BinaryTree): Int =
    binaryTree match {
      case Leaf(x) => x
      case Node(op, nodes @_*) => {
        op match {
          case '*' => nodes.map(leafOp(_)).reduce(_ * _)
          case '+' => nodes.map(leafOp(_)).reduce(_ + _)
          case '-' => nodes.map(leafOp(_)).foldLeft(0)(_ - _)
        }
      }
    }

  val tree = Node('+',Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5), Leaf(6)))
  println(leafOp(tree))

}
