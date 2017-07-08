package chapter11

/**
  * Created by difeng on 2017/7/8.
  * 提供一个Matrix类——你可以选择需要的是一个2 x 2的矩阵，任意大小的正方形矩阵，
  * 或是m x n的矩阵。支持+和*操作。*操作应该同样适用于单值，例如mat * 2。单个元素可以通过mat(row,col)得到
  */
object Exercise_8 extends App {

  class Matrix(val m: Int,val n: Int) {

    private val arr = Array.ofDim[Double](m, n)

    def apply(row: Int, col: Int): Double = arr(row)(col)

    def update(row: Int,col: Int,value: Double) = {
      arr(row)(col) = value
    }

    def + (other: Matrix): Matrix = {
      require(m == other.m)
      require(n == other.n)
      val ret = new Matrix(m,n)
      for(i <- 0 until m;j <- 0 until n) {
        ret(i,j) = arr(i)(j) + other(i,j)
      }
      ret
    }

    def * (other: Matrix): Matrix = {
      require(n == other.m)
      val ret = new Matrix(m,other.n)
      for(i <- 0 until m;j <- 0 until other.n) {
        val otherCols = Array.ofDim[Double](other.m)
        for (k <- 0 until other.m) {
          otherCols(k) = other(k,j)
        }
        ret(i,j) = arr(i).zip(otherCols).map(x => x._1 * x._2).sum
      }
      ret
    }

    def * (cont: Int): Matrix = {
      val ret = new Matrix(m,n)
      for(i <- 0 until m;j <- 0 until n) {
        ret(i,j) = arr(i)(j) * cont
      }
      ret
    }
    override def toString: String = arr.map(_.mkString(" [","  "," ]")).mkString("[\n","\n","]")
  }

  val mat1 = new Matrix(2,2)
  mat1(0,0) = 1
  mat1(0,1) = 2
  mat1(1,0) = 3
  mat1(1,1) = 4
  val mat2 = new Matrix(2,2)
  mat2(0,0) = 5
  mat2(0,1) = 6
  mat2(1,0) = 7
  mat2(1,1) = 8
  println(mat1 + mat2)
  println(mat1 * 2)
  println(mat1 * mat2)

}
